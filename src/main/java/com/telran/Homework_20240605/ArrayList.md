## Создание `ArrayList`

```
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание пустого ArrayList
        ArrayList<String> list = new ArrayList<>();
    }
}
```
### Основные методы

- **`boolean add(E e)`** - добавляет элемент `e` в конец списка.

 ```
list.add("element");
```

- **`void add(int index, E element)`**  - вставляет элемент `element` в указанный индекс `index`.

```
list.add(1, "newElement");
```

- **`boolean addAll(Collection<? extends E> c)`** - добавляет все элементы из коллекции `c` в конец списка.

```
ArrayList<String> otherList = new ArrayList<>();
otherList.add("item1");
otherList.add("item2");

list.addAll(otherList);
```

- **`E get(int index)`**  - возвращает элемент, находящийся по указанному индексу `index`.

```
String element = list.get(0);
System.out.println("First element: " + element);
```
  
- **`E set(int index, E element)`** - заменяет элемент в указанном индексе `index` на `element`

```
String element = list.get(0);
System.out.println("First element: " + element);
```

- **`E remove(int index)`** - удаляет элемент по указанному индексу `index` и возвращает его.

```
String removedElement = list.remove(0);
System.out.println("Removed element: " + removedElement);
```

- **`boolean remove(Object o)`** - удаляет первое вхождение объекта `o` из списка, если он присутствует.

```
boolean isRemoved = list.remove("element");
System.out.println("Element removed: " + isRemoved);
```

- **`int size()`** - возвращает количество элементов в списке.

```
int size = list.size();
System.out.println("List size: " + size);
```

- **`void clear()`**  - удаляет все элементы из списка.

```
list.clear();
System.out.println("List cleared. Size: " + list.size());
```

- **`boolean isEmpty()`** - проверяет, пуст ли список.

```
boolean empty = list.isEmpty();
System.out.println("Is list empty? " + empty);
```

- **`boolean contains(Object o)`** - проверяет, содержит ли список указанный элемент `o`.

```
boolean contains = list.contains("element");
System.out.println("Contains 'element'? " + contains);
```

- **`int indexOf(Object o)`** - возвращает индекс первого вхождения элемента `o` или `-1`, если элемент не найден.

```
int index = list.indexOf("element");
System.out.println("Index of 'element': " + index);
```

- **`int lastIndexOf(Object o)`** - возвращает индекс последнего вхождения элемента `o` или `-1`, если элемент не найден.

```
list.add("element");
int lastIndex = list.lastIndexOf("element");
System.out.println("Last index of 'element': " + lastIndex);
```

- **`Object[] toArray()`** - возвращает массив, содержащий все элементы списка.

```
Object[] array = list.toArray();
System.out.println("Array: " + Arrays.toString(array));
```

- **`<T> T[] toArray(T[] a)`** - возвращает массив, содержащий все элементы списка в указанном массиве `a`.

```
String[] array = list.toArray(new String[0]);
System.out.println("Array: " + Arrays.toString(array));
```

### Примеры использования всех методов

```
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создание ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("element1");
        list.add(0, "element0");
        
        // Добавление коллекции
        ArrayList<String> otherList = new ArrayList<>();
        otherList.add("element2");
        otherList.add("element3");
        list.addAll(otherList);
        
        // Получение элемента
        String element = list.get(0);
        System.out.println("First element: " + element);
        
        // Обновление элемента
        list.set(0, "updatedElement");
        
        // Удаление элемента по индексу
        String removedElement = list.remove(0);
        System.out.println("Removed element: " + removedElement);
        
        // Удаление элемента по значению
        boolean isRemoved = list.remove("element2");
        System.out.println("Element removed: " + isRemoved);
        
        // Размер списка
        int size = list.size();
        System.out.println("List size: " + size);
        
        // Проверка пустоты списка
        boolean empty = list.isEmpty();
        System.out.println("Is list empty? " + empty);
        
        // Проверка наличия элемента
        boolean contains = list.contains("element3");
        System.out.println("Contains 'element3'? " + contains);
        
        // Индекс элемента
        int index = list.indexOf("element3");
        System.out.println("Index of 'element3': " + index);
        
        // Последний индекс элемента
        list.add("element3");
        int lastIndex = list.lastIndexOf("element3");
        System.out.println("Last index of 'element3': " + lastIndex);
        
        // Преобразование в массив
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));
        
        // Преобразование в массив с указанием типа
        String[] arrayWithType = list.toArray(new String[0]);
        System.out.println("Array with type: " + Arrays.toString(arrayWithType));
        
        // Очистка списка
        list.clear();
        System.out.println("List cleared. Size: " + list.size());
    }
}
```