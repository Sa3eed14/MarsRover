# MarsRover
Java Implementation of how a Rover translates String commands into movement executions. There are 4 Commands: "F" for forward movement. "B" for backwards movement. "L" for rotating 90 degrees left. "R" for rotating 90 degrees right.

Example of a String Command is "FLFFFLRB"

The solution proposes usage of Hashmap in favor of using IF/CASE statements.

The program runs by running the InstructionControl class which is the main class, just to change the string passed argument of the resolveInstructions() method
