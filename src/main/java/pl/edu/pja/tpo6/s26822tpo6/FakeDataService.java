package pl.edu.pja.tpo6.s26822tpo6;
import net.datafaker.Faker;

import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
@Service
public class FakeDataService {
    public PersonDTO createN(Integer[] code, String locale,int num)
    {
        HashMap<String,String[]> labels=new HashMap<>();
        labels.put("ru", new String[]{"имя", "фамилия", "дата рождения", "адрес", "университет", "страна происхождения", "пол", "группа крови", "работа", "МБТИ", "номер телефона"});
        labels.put("en",new String[]{"first name"	,"last name"	,"birth date"	,"address",	"university",	"country of origin"	,"gender"	,"blood type"	,"job"	,"MBTI"	,"phone number"});
        labels.put("fr",new String[]{"nom", "nom de famille", "date de naissance", "adresse", "université", "pays d'origine", "genre", "groupe sanguin", "emploi", "MBTI", "numéro de téléphone"});
        labels.put("de",new String[]{"name", "nachname", "geburtsdatum", "adresse", "universität", "herkunftsland", "geschlecht", "blutgruppe", "beruf", "MBTI", "telefonnummer"});
        labels.put("es",new String[]{"nombre", "apellido", "fecha de nacimiento", "dirección", "universidad", "país de origen", "género", "tipo de sangre", "trabajo", "MBTI", "número de teléfono"});
        labels.put("it",new String[]{"nome", "cognome", "data di nascita", "indirizzo", "università", "paese di origine", "genere", "gruppo sanguigno", "lavoro", "MBTI", "numero di telefono"});
        labels.put("ja",new String[]{"名前", "苗字", "生年月日", "住所", "大学", "出身国", "性別", "血液型", "職業", "MBTI", "電話番号"});
        labels.put("pt",new String[]{"nome", "sobrenome", "data de nascimento", "endereço", "universidade", "país de origem", "gênero", "tipo sanguíneo", "emprego", "MBTI", "número de telefone"});
        labels.put("ar",new String[]{"الاسم", "اللقب", "تاريخ الولادة", "العنوان", "الجامعة", "بلد المنشأ", "الجنس", "فصيلة الدم", "الوظيفة", "MBTI", "رقم الهاتف"});
        labels.put("id",new String[]{"nama", "nama belakang", "tanggal lahir", "alamat", "universitas", "negara asal", "jenis kelamin", "golongan darah", "pekerjaan", "MBTI", "nomor telepon"});
        for (String k:labels.keySet())
        {
            List<String> list=new ArrayList<>();
            list.add(labels.get(k)[0]);
            list.add(labels.get(k)[1]);
            list.add(labels.get(k)[2]);
            if(code!=null)
            {
                for (Integer integer : code)
                {
                    list.add(labels.get(k)[integer+2]);
                }
                labels.replace(k, list.toArray(new String[0]));
            }
            labels.replace(k,list.toArray(new String[0]));
        }
        List<Person> list=new ArrayList<>();
        while (num>0)
        {
            list.add(generate(code,new Locale(locale)));
            num--;
        }
        return new PersonDTO(list,labels,locale);
    }
    public Person generate(Integer[] code, Locale locale)
    {
        List<String> list=new ArrayList<>();
        Faker faker=new Faker(locale);
        list.add(faker.name().firstName());
        list.add(faker.name().lastName());
        list.add(faker.date().birthday("dd/mm/yyyy"));
        for (int i=1,j=0;i<=8;i++)
        {
            if(code!=null)
            {
                if(j<code.length)
                {
                    if(code[j]==i) {
                        switch (i) {
                            case 1:
                                list.add(faker.address().fullAddress());
                                break;
                            case 2:
                                list.add(faker.university().name());
                                break;
                            case 3:
                                list.add(faker.country().name());
                                break;
                            case 4:
                                list.add(faker.gender().types());
                                break;
                            case 5:
                                list.add(faker.bloodtype().bloodGroup());
                                break;
                            case 6:
                                list.add(faker.job().title());
                                break;
                            case 7:
                                list.add(faker.mbti().name());
                                break;
                            case 8:
                                list.add(faker.phoneNumber().phoneNumber());
                                break;
                        }
                        j++;
                    }
                    else
                        list.add(null);
                }
                else list.add(null);
            }

            else
                list.add(null);
        }
        return new Person(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4),list.get(5),list.get(6),list.get(7),list.get(8),list.get(9),list.get(10));
    }
}