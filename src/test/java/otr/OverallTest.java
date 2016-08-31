package otr;

/**
 * Created by user on 31.08.2016.
 */

import org.junit.Test;
import org.junit.Ignore;
import otr.Model.PhoneBook;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
public class OverallTest {
    @Test
    public void CheckDB() {
        PhoneBook pb = new PhoneBook();
        ArrayList<String> result = pb.searchPhone("");
        assertNull("Значений в базе быть не должно", result);

        result = pb.searchPhone("Иванов И.И.");
        assertNotNull("Отсутствует значения в базе для ключа Иванов И.И.", result);
        assertTrue("Неверное количество записей для Иванов И.И.!", result.size() == 2);

        result = pb.searchPhone("Петров П.П.");
        assertNotNull("Отсутствует значения в базе для ключа Петров П.П.", result);
        assertTrue("Неверное количество записей для Петров П.П.!", result.size() == 1);

        result = pb.searchPhone("Сидоров С.С.");
        assertNotNull("Отсутствует значения в базе для ключа Сидоров С.С.", result);
        assertTrue("Неверное количество записей для Сидоров С.С.!", result.size() == 3);
    }

    @Test
    @Ignore("Будет подключен после добавления соответствующих записей в БД.")
    public void CheckDB2() {
        PhoneBook pb = new PhoneBook();
        ArrayList<String> result = pb.searchPhone("Колесников Е.А.");

        assertNotNull("Отсутствует значения в базе для ключа Колесников Е.А.", result);
        assertTrue("Неверное количество записей для Колесников Е.А.!", result.size() == 2);
    }

}
