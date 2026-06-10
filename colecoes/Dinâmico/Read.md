📚 COLLECTIONS FRAMEWORK EM JAVA
O QUE É?
O Collections Framework é um conjunto de interfaces e classes para armazenar e manipular grupos de objetos de forma eficiente.
Hierarquia Principal:

Iterable (interface raiz)
    │
    └── Collection (interface)
            │
            ├── List (interface) - ordenada, permite duplicatas
            │       ├── ArrayList
            │       ├── LinkedList
            │       └── Vector (antigo)
            │
            ├── Set (interface) - NÃO permite duplicatas
            │       ├── HashSet
            │       ├── LinkedHashSet
            │       └── TreeSet
            │
            └── Queue (interface) - FIFO (primeiro a entrar, primeiro a sair)
                    ├── PriorityQueue
                    └── LinkedList (também implementa Queue)

    └── Map (interface) - NÃO é Collection! (pares chave-valor)
            ├── HashMap
            ├── LinkedHashMap
            ├── TreeMap
            └── Hashtable (antigo)

ArrayList vs LinkedList

Característica	        ArrayList	                        LinkedList
Estrutura interna	    Array dinâmico	                    Lista duplamente encadeada
Acesso por índice	    O(1) - muito rápido	                O(n) - lento
Inserção no meio	    O(n) - lento (desloca elementos)	O(1) - rápido (se tiver nó)
Inserção no fim	        O(1) - amortizado	                O(1)
Remoção	                O(n) - lento	                    O(1) - rápido
Memória	                Menos overhead	                    Mais overhead (nós)