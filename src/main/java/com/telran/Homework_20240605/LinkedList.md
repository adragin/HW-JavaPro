
## Создание LinkedList

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Создание пустого LinkedList
        LinkedList<String> list = new LinkedList<>();
    }
}
```

Основные методы

- `boolean add(E e)` - добавляет элемент e в конец списка.

```java
list.add("element");
System.out.println(list); // [element]
```

- `void add(int index, E element)` - вставляет элемент element в указанный индекс index.

```java
list.add(0, "newElement");
System.out.println(list); // [newElement, element]
```

- `boolean addAll(Collection<? extends E> c)` - добавляет все элементы из коллекции c в конец списка.

```java
LinkedList<String> otherList = new LinkedList<>();
otherList.add("anotherElement");
list.addAll(otherList);
System.out.println(list); // [newElement, element, anotherElement]
```

- `void addFirst(E e)` - вставляет элемент e в начало списка.

```java
list.addFirst("firstElement");
System.out.println(list); // [firstElement, newElement, element, anotherElement]
```

- `void addLast(E e)` - вставляет элемент e в конец списка.

```java
list.addLast("lastElement");
System.out.println(list); // [firstElement, newElement, element, anotherElement, lastElement]
```

- `E get(int index)` - возвращает элемент, находящийся по указанному индексу index.

```java
String element = list.get(0);
System.out.println(element); // firstElement
```

- `E getFirst()` - возвращает первый элемент списка.

```java
String firstElement = list.getFirst();
System.out.println(firstElement); // firstElement
```

- `E getLast()` - возвращает последний элемент списка.

```java
String lastElement = list.getLast();
System.out.println(lastElement); // lastElement
```

- `E set(int index, E element)` - заменяет элемент в указанном индексе index на element.

```java
list.set(1, "updatedElement");
System.out.println(list); // [firstElement, updatedElement, element, anotherElement, lastElement]
```

- `E remove(int index)` - удаляет элемент по указанному индексу index и возвращает его.

```java
String removedElement = list.remove(1);
System.out.println(removedElement); // updatedElement
System.out.println(list); // [firstElement, element, anotherElement, lastElement]
```

- `boolean remove(Object o)` - удаляет первое вхождение объекта o из списка, если он присутствует.

```java
boolean isRemoved = list.remove("element");
System.out.println(isRemoved); // true
System.out.println(list); // [firstElement, anotherElement, lastElement]
```

- `E removeFirst()` - удаляет и возвращает первый элемент списка.

```java
String removedFirstElement = list.removeFirst();
System.out.println(removedFirstElement); // firstElement
System.out.println(list); // [anotherElement, lastElement]
```

- `E removeLast()` - удаляет и возвращает последний элемент списка.

```java
String removedLastElement = list.removeLast();
System.out.println(removedLastElement); // lastElement
System.out.println(list); // [anotherElement]
```

- `int size()` - возвращает количество элементов в списке.

```java
int size = list.size();
System.out.println(size); // 1
```

- `void clear()` - удаляет все элементы из списка.

```java
list.clear();
System.out.println(list); // []
```

- `boolean isEmpty()` - проверяет, пуст ли список.

```java
boolean empty = list.isEmpty();
System.out.println(empty); // true
```

- `boolean contains(Object o)` - проверяет, содержит ли список указанный элемент o.

```java
list.add("element");
boolean contains = list.contains("element");
System.out.println(contains); // true
```

- `int indexOf(Object o)` - возвращает индекс первого вхождения элемента o или -1, если элемент не найден.

```java
int index = list.indexOf("element");
System.out.println(index); // 0
```

- `int lastIndexOf(Object o)` - возвращает индекс последнего вхождения элемента o или -1, если элемент не найден.

```java
list.add("element");
int lastIndex = list.lastIndexOf("element");
System.out.println(lastIndex); // 1
```

- `Object[] toArray()` - возвращает массив, содержащий все элементы списка.

```java
Object[] array = list.toArray();
System.out.println(Arrays.toString(array)); // [element, element]
```

- `<T> T[] toArray(T[] a)` - возвращает массив, содержащий все элементы списка в указанном массиве a.

```java
String[] array = list.toArray(new String[0]);
System.out.println(Arrays.toString(array)); // [element, element]
Дополнительные методы LinkedList
```

- `E peek()` - возвращает первый элемент списка без удаления. Возвращает null, если список пуст.

```java
String firstElement = list.peek();
System.out.println(firstElement); // element
```

- `E poll()` - возвращает и удаляет первый элемент списка. Возвращает null, если список пуст.

```java
String firstElement = list.poll();
System.out.println(firstElement); // element
System.out.println(list); // [element]
```

- `void push(E e)` - вставляет элемент e в начало списка.

```java
list.push("firstElement");
System.out.println(list); // [firstElement, element]
```

- `E pop()` - возвращает и удаляет первый элемент списка.

```java
String firstElement = list.pop();
System.out.println(firstElement); // firstElement
System.out.println(list); // [element]
```


