

## 📦 Rodzaje klas składowych w Javie

### 1. **Static Nested Class** – **Statyczna klasa zagnieżdżona**
- **Definicja**: Klasa zdefiniowana wewnątrz innej klasy z modyfikatorem `static`.
- **Cechy**:
  - Nie ma dostępu do instancji klasy zewnętrznej (może jednak korzystać z jej statycznych elementów).
  - Używana najczęściej, gdy klasa pomocnicza logicznie przynależy do klasy zewnętrznej, ale nie potrzebuje dostępu do jej instancji.

```java
public class Outer {
    static class StaticNested {
        void display() {
            System.out.println("Static nested class");
        }
    }
}
```

---

### 2. **Non-static Member Class** – **Niestatyczna klasa wewnętrzna**
- **Definicja**: Klasa zdefiniowana wewnątrz innej klasy **bez** słowa kluczowego `static`.
- **Cechy**:
  - Ma dostęp do wszystkich pól i metod klasy zewnętrznej (również prywatnych).
  - Każda instancja klasy wewnętrznej jest powiązana z instancją klasy zewnętrznej.

```java
public class Outer {
    class Inner {
        void display() {
            System.out.println("Non-static inner class");
        }
    }
}
```

---

### 3. **Local Class** – **Lokalna klasa**
- **Definicja**: Klasa zdefiniowana **wewnątrz metody** lub bloku inicjalizacyjnego.
- **Cechy**:
  - Widoczna tylko w obrębie tego bloku.
  - Może korzystać ze zmiennych lokalnych metody **tylko jeśli są one final lub effectively final**.
  - Używana do enkapsulacji pomocniczej logiki.

```java
public void someMethod() {
    class Local {
        void print() {
            System.out.println("Local class");
        }
    }
    Local local = new Local();
    local.print();
}
```

---

### 4. **Anonymous Class** – **Klasa anonimowa**
- **Definicja**: Klasa bez nazwy, używana najczęściej do utworzenia jednorazowej instancji klasy implementującej interfejs lub dziedziczącej po klasie.
- **Cechy**:
  - Krótka i zwięzła, często używana przy przekazywaniu obiektów np. do metod jako argumenty.
  - Nie nadaje się do wielokrotnego użycia.

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Anonymous class");
    }
};
```

---

## 🧠 Podsumowanie

| Typ klasy               | Angielska nazwa         | Statyczna? | Miejsce definicji                 | Dostęp do instancji klasy zewnętrznej |
|------------------------|--------------------------|------------|-----------------------------------|---------------------------------------|
| Klasa statyczna        | Static nested class       | ✅         | Wewnątrz klasy                    | ❌                                     |
| Klasa wewnętrzna       | Non-static member class   | ❌         | Wewnątrz klasy                    | ✅                                     |
| Klasa lokalna          | Local class               | ❌         | W metodzie/bloku                  | ✅ (jeśli zmienne są final/effectively final) |
| Klasa anonimowa        | Anonymous class           | ❌         | W wyrażeniu (np. przypisaniu)     | ✅                                     |

---


