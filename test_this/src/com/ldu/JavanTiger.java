package com.ldu;

class JavanTiger {
    int age;      // ����
    int hight;    // ����߶�

    public JavanTiger() {
        print();
        this.age=2;   //�����ʼ�� age ��ֵ �����ݹ鷵�ص�ʱ�����ֵ�ᱻ��д
    }
    
    public JavanTiger(int age) {
        this();      // �����Լ��ĵ�һ�����캯��������������������ִ�е�
        this.age = age;
        print();
    }

    public JavanTiger(int age, int hight) {
    	
        this(age);   // �����Լ��ڶ������캯��  ������������������ִ�е�
        this.hight = hight;
        print();
    }

    public void print() {  //��ӡ����
        System.out.println("I'am a " + age + "�� " + hight + "�߸� tiger!");
    }
    public static void main(String[] args) {
        new JavanTiger(3,3);
    }
}
//output
//I'am a 0�� 0�߸� tiger!
//I'am a 3�� 0�߸� tiger!
//I'am a 3�� 3�߸� tiger!