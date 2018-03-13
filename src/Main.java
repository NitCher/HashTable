public class Main {
    public static void main(String[] args) {
        // Создание хэш-таблицы
        MyHashTable myHashTable = new MyHashTable(10);

        // Добавление ключей и объектов
        myHashTable.add(1, 10);
        myHashTable.add(2, 10);
        myHashTable.add(3, 15);
        myHashTable.add(4, 20);
        myHashTable.add(5, 25);
        myHashTable.add(6, 30);
        myHashTable.add(7, 45);
        myHashTable.add(8, 60);
        myHashTable.add(9, 90);
        myHashTable.add(10, 100);

        // Находим значение ключа 6
        myHashTable.find(6);

        // Удаляем ключ 6
        myHashTable.remove(6);

        // Ошибка при попытке удалить несуществующий ключ
        myHashTable.remove(6);

        // Убеждаемся в том, что ключа 6 больше нет
        myHashTable.find(6);

        // Проверка на корректное добавление нового ключа в отсутствующей позиции 6, вместо конца таблицы
        myHashTable.add(6, 35);

        // Проверяем вновь добавленный ключ
        myHashTable.find(6);

        // Сравнения хранимых ключами данных
        myHashTable.compare(1, 2);
        myHashTable.compare(2, 3);

        // Попытка добавления ключа, превышающего количество общих ключей в 'new MyHashTable(10)'
        myHashTable.add(11, 150);
        // Освобождение места и добавление ключа
        myHashTable.remove(10);
        myHashTable.add(11, 150);
    }
}



