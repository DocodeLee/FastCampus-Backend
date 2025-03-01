e# FastCampus-Backend-precourse

## 개발환경 세팅
원래는 src 파일에서 실행하면 out으로 생성되는데 터미널로도 생성이 가능핳다

javac .. src 폴더에서 : 컴파일  > 자바

컴파일 이란 : 인간어를 byte 로 변환해서 컴퓨터에게 알려주기  

java .. out 폴더에서 : 실행 > 클래스

실행 : 바이트코드로 된거 실행

![image](https://github.com/user-attachments/assets/13f0b268-87d1-4b1d-b9e1-a87558a1239b)

# JVM
java file 이 javac.exe에 의해서 컴파일 중간어 코드가 된다. 이는 OS 독립적으로 되고 java.exe 가 다시 호출 (RemoteProcessCall)

# Variable & Datatype + Assign

## boolean : 1 byte, char : 2 byte, float : 4 byte, double : 8 byte , long : 8 byte (short : 2byte)

Data Type  : Primitive Type & User Define Data Type

primitive : int, float, char, byte, long ...

(char : including 한글 as 2 byte)

User Define Data type is made by class

### String is already maded as class by java

# Symbol Table
## When Variable is maded it is managed in table > similar with HashMap

Key is  Variable name and Value is saved Hexadecimal


# Data type
Primitive and User Declaration

### Casting : change Datatype

## String is also treated as Object 

Compiler find the datatype from the API

String is maded but it is use usallys so is set as default > java.lang.String

## Casting
change Datatype

(int)'A' = 65 

(char) 65 = 'A'

(int) 2.6f = 2

(float) 10 = 10.0f

# Object & Class
containing several variables,

Objects have Default Constructor

Object = obj >> this is just instance  > need to set this to new Object

## Object obj = new Object();

obj . : "." is dot cacuclator

# Arrays
초기화 : 선언 + 저장

int [] a = new int[length];

char [] c = new char[length];

int [] a = new int[]{elements};

also arrays can adapt to object

### 2-demension arrays
int[][] a = new int[row][col];

# Ternery Operator
(statement)? A:B  (true) : false

# Method
Object function 

data ineteract with methods.

method return the value with the method name > it treats as value

# Static Binding

use same method with different data type then when compiling compiler search method > static binding

If you use different method name it is not binding

# Dynamic Binding

Use @Overrid > and call the method when it needs.

but it takes more memory and takes more time

# DTO : Data Transfer Object

# Object Oriented Programming

DTO : Data Transfer Object, VO : Virtula Object

DAO : Data Access Object

It is useful when we transfer the object datas

# DAO : CRUD activity with database

# Access
### In same Package : Public and Default
### in different Pacakge : Only Public

## How can we access to private data

Need to use Getter Setter methods

