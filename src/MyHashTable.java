public class MyHashTable {

    private Object[] keys;
    private Object[] objects;

    boolean doesPrintToConsole = false;

    /*Конструктор*/
    MyHashTable(int size) {
        keys = new Object[size];
        objects = new Object[size];
    }

    /*Добавление*/
    void add(Object key, Object object) {
        boolean doesEmptyKeyExists = false;

        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null) {
                doesEmptyKeyExists = true;
                break;
            }
        }

        if (doesEmptyKeyExists) {
            for (int i = 0; i < keys.length; i++) {
                if (keys[i] != null && keys[i] == key) {
                    if (doesPrintToConsole) System.out.println("Ключ " + key + " уже есть");
                    break;
                } else if (keys[i] == null) {
                    keys[i] = key;
                    objects[i] = object;
                    if (doesPrintToConsole) System.out.println("Ключ " + key + " добавлен, его объект: " + object);
                    break;
                }
            }
        } else {
            if (doesPrintToConsole) System.out.println("Достигнут лимит ключей");
        }
    }

    /*Поиск*/
    boolean find(Object key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key) {
                if (doesPrintToConsole) System.out.println("Ключ " + key + " найден, его обьект: " + objects[i]);
                return true;
            }
        }

        if (doesPrintToConsole) System.out.println("Ключ " + key + " не найден");
        return false;
    }

    /*Равенство*/
    boolean compareKeys(Object key1, Object key2) {
        Object object1 = 0;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key1) {
                object1 = objects[i];
            }
        }
        Object object2 = 0;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key2) {
                object2 = objects[i];
            }
        }
        if (object1 == object2) {
            if (doesPrintToConsole) System.out.println("Объекты ключей " + key1 + " и " + key2 + " равны");
            return true;
        } else {
            if (doesPrintToConsole) System.out.println("Объекты ключей " + key1 + " и " + key2 + " разные");
            return false;
        }
    }

    boolean compareWithOtherTable(MyHashTable otherTable) {
        for (int i = 0; i < keys.length; i++) {
            if (!objects[i].equals(otherTable.objects[i])) {
                if (doesPrintToConsole) System.out.println("Указанная хэш-таблица имеет другие объекты");
                return false;
            }
        }

        if (doesPrintToConsole) System.out.println("Сравниваемые объекты хэш-таблиц идентичны");
        return true;
    }

    /*Удаление*/
    void remove(Object key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key) {
                keys[i] = null;
                objects[i] = null;
                if (doesPrintToConsole) System.out.println("Ключ " + key + " и его объект удалены");
                return;
            }
        }

        if (doesPrintToConsole) System.out.println("Невозможно удалить ключ " + key + ", ключ не найден");
    }
}
