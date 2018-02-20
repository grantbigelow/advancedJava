#!/bin/bash
echo "Hello World"

fun ()
{ 
  i = 0
  x =5
  while [ $i -lt $x ]
  do
    echo "Counting in a loop"$i
    echo
    let "i+=1"
  done
}
fun
sleep 30