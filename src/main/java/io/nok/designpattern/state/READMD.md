## State Pattern

하나의 상태에서 다른 상태로 진행될 때, 어떻게 진행되어야 하는 지를 각 클래스로 분리한다.
Mail 이라는 객체가 있을 때, 상태는 Draft, Scheduled, Published 가 존재한다. 각 상태는 아래 그래프처럼 진행된다.

```mermaid
[Draft] --> [Scheduled]
[Scheduled] --> [Published]
[Draft] --> [Published]
```

이런 과정을 하나의 클래스로 구현하면, 클래스가 너무 커지고, 유지보수가 어려워진다.
따라서 각 상태를 클래스로 분리하여, 상태에 따라 클래스를 변경하면 된다.