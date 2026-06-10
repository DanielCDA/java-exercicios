Throwable (classe mãe de todos os erros/exceções)
│
├── Error (erros graves da JVM - NÃO tratamos)
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── VirtualMachineError
│
└── Exception (exceções - PODEMOS tratar)
    │
    ├── RuntimeException (unchecked - não obrigatório tratar)
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   ├── ArithmeticException
    │   ├── IllegalArgumentException
    │   └── NumberFormatException
    │
    └── Checked Exception (obrigatório tratar ou declarar)
        ├── IOException
        ├── SQLException
        ├── FileNotFoundException
        └── ClassNotFoundException

Estudo potencial sobre try-catch-finally-throw