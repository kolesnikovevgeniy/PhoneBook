package otr.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 31.08.2016.
 */
public class PhoneBook {

    private Map<String,ArrayList<String>> mpPhones = new HashMap<String, ArrayList<String>>();
    public PhoneBook()
    {
        // инициализируем справочник
        mpPhones.put("Иванов И.И.", new ArrayList<String>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        mpPhones.put("Петров П.П.", new ArrayList<String>(Arrays.asList("+8 800 2000 700")));
        mpPhones.put("Сидоров С.С.", new ArrayList<String>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
    }

    // функция поиска в справочнике
    public ArrayList<String> searchPhone(String strFio)
    {
        if (mpPhones.containsKey(strFio))
        {
            return mpPhones.get(strFio);
        }
        return null;
    }
}
