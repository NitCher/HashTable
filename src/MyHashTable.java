
public class MyHashTable {

    private Integer[] keys;
    private Integer[] objects;


    /*Конструктор*/
    MyHashTable(int size) {
        keys = new Integer[size];
        objects = new Integer[size];
    }

    /*Добавление*/

    void add(int key, int object) {
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
                    System.out.println("Ключ " + key + " уже есть");
                    break;
                } else if (keys[i] == null) {
                    keys[i] = key;
                    objects[i] = object;
                    System.out.println("Ключ " + key + " добавлен, его объект: " + object);
                    break;
                }
            }
        } else {
            System.out.println("Достигнут лимит ключей");
        }
    }

    /*Поиск*/

    void find(int key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key) {
                System.out.println("Ключ " + key + " найден, его обьект: " + objects[i]);
                return;
            }
        }

        System.out.println("Ключ " + key + " не найден");
    }

    /*Равенство*/

    boolean compare(int key1, int key2) {
        int object1 = 0;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key1) {
                object1 = objects[i];
            }
        }
        int object2 = 0;
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key2) {
                object2 = objects[i];
            }
        }
        if (object1 == object2) {
            System.out.println("Объекты ключей " + key1 + " и " + key2 + " равны");
            return true;
        } else {
            System.out.println("Объекты ключей " + key1 + " и " + key2 + " разные");
            return false;
        }
    }

    /*Удаление*/
    void remove(int key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null && keys[i] == key) {
                keys[i] = null;
                objects[i] = null;
                System.out.println("Ключ " + key + " и его объект удалены");
                return;
            }
        }

        System.out.println("Невозможно удалить ключ " + key + ", ключ не найден");
    }
}

