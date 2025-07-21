# Command Design Pattern

The **Command Design Pattern** is a behavioral pattern that encapsulates a request as an object, allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations. It decouples the object that invokes the operation from the one that knows how to perform it.

## Structure

```mermaid
classDiagram
    class ICommand {
        +execute()
    }
    class TurnAcOn
    class TurnAcOff
    class AirConditioner
    class RemoteControl
    class Television
    class TurnTvOn
    class TurnTvOff

    ICommand <|-- TurnAcOn
    ICommand <|-- TurnAcOff
    ICommand <|-- TurnTvOn
    ICommand <|-- TurnTvOff
    TurnAcOn --> AirConditioner
    TurnAcOff --> AirConditioner
    TurnTvOn --> Television
    TurnTvOff --> Television
    RemoteControl --> ICommand
```

## Example: Air Conditioner (AC) & Television Control

In our Java implementation (`App.java`), we use the Command pattern to control both an AC and a Television:

- **AirConditioner**: The receiver, with methods to turn on/off.
- **Television**: Another receiver, with methods to turn on/off.
- **ICommand**: Interface with `execute()` method.
- **TurnAcOn / TurnAcOff / TurnTvOn / TurnTvOff**: Concrete commands that call `turnOn()` or `turnOff()` on the respective device.
- **RemoteControl**: The invoker, which triggers commands.

### Sequence

```mermaid
sequenceDiagram
    participant Client
    participant RemoteControl
    participant ICommand
    participant AirConditioner
    participant Television

    Client->>RemoteControl: setCommand(TurnAcOn)
    RemoteControl->>ICommand: execute()
    ICommand->>AirConditioner: turnOn()
    AirConditioner-->>ICommand: AC is ON

    Client->>RemoteControl: setCommand(TurnTvOn)
    RemoteControl->>ICommand: execute()
    ICommand->>Television: turnOn()
    Television-->>ICommand: TV is ON
```

## Benefits

- Decouples sender and receiver.
- Makes it easy to add new commands.
- Supports features like undo/redo and logging.
