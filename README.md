## Conference Track Management

### Prerequisites
* Java 1.8 or above
* JUnit (for test dependencies)

### How to Run the Program

```
java -jar /path/to/conferencetrackmanagement.jar /path/to/input_file
```

### Design

#### ConferenceScheduler

* The `Scheduler` class provides a method called `schedule()` as an API to create a
  `Conference` object representing a scheduled conference with tracks for the provided input
* Example use of the API:
```
BufferedReader reader = new BufferedReader(new FileReader(inputFile));
Conference conference = new Scheduler().schedule(reader);
System.out.print(conference);
```

#### Conference

* A `Conference` object returns the schedule as a string via its `toString()`
  method.
  
#### Track

* An object representation of a single track of a conference. Each `Track` object contains one
  or more `Slot`s

#### Session

* A `Session` represents a group of talks or events in a `Track` with a fixed start and end time. E.g.: the
  morning slot starting at 9 AM and ending at 12 PM with multiple events in it

#### Talk

* An talk of the conference

### TODO

* Expand javadoc
* Expand unit tests

