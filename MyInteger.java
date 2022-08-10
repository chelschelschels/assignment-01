public class MyInteger {
private int myvalue; //data field

public MyInteger(int value) { 
myvalue = value;
}
public int getValue() {
return myvalue;
}

public boolean isEven() { 
return (myvalue % 2) == 0;
}

public boolean isOdd() { 
return (myvalue % 2) == 1;
}

public boolean isPrime() { 
if (myvalue == 1 || myvalue == 2) {
return true;
}
else {
for(int i = 2; i < myvalue; i++) {
if(i % myvalue == 0)
return false;
}
}
return true;
}

public static boolean isEven(MyInteger myInt) { 
return myInt.isEven();
}

public static boolean isOdd(MyInteger myInt) { 
return myInt.isOdd();
}

public static boolean isPrime(MyInteger myInt) { 
return myInt.isPrime();
}

public boolean equals(int obInt) { //value of object
if(obInt == myvalue)
return true;
else
return false;

}

}
