
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

//public class MyHashTable {
//
//    public int[] keys;
//    public int[] objects;
//
//    /*Koнструктор*/
//    MyHashTable(int size) {
//
//        keys = new int[size];
//        objects = new int[size];
//    }
//
//
//    boolean add(int key, int object) {
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] == object) {
//                System.out.println(key + " уже имеется");
//                return false;
//
//            }
//            if (keys[i] == 0) {
//                keys[i] = key;
//                objects[i] = object;
//                break;
//            }
//            else {
//                System.out.println("Свободных ключей больше нет");
//                break;
//            }
//        }
//        return true;
//    }
//
//    boolean find(int object) {
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] == object) {
//                System.out.println(object + " нашёлся");
//                return true;
//            }
//        }
//        return false;
//    }
//
//    boolean compare(int key1, int key2) {
//        if (objects[key1] == objects[key2]) {
//            System.out.println("одинаковые");
//            return true;
//        } else {
//            System.out.println("Разные");
//            return false;
//        }
//    }
//
//}
