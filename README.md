# digdag-wait-op

Digdag _wait>_ operator. Simply wait specified duration.
This is an example for Extension of Digdag.

## Example
````
+task1:
  echo>: start

+task2:
  wait>: 30s

+task3:
  echo>: end
````

## Install
- clone repository
- ./gradlew jar
- confirm your digdag binary path.
  ```
  $ which digdag
  /Users/xxxx/bin/digdag
  ```
- run digdag
  ```
  java -cp /Users/xxxx/bin/digdag:./build/libs/digdag-wait-op.jar io.digdag.cli.Main <command>
  ```

