package com.udemy.homework;

import java.util.Comparator;

public class Student {
	private int rollno;
	private String name;
	private int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	/*
	 * @Override public int compareTo(Object comparesTu) { String comparesToAge =
	 * ((Student) comparesTu).getName(); return this.name.compareTo(comparesToAge);
	 * }
	 */

	public static Comparator<Student> StudentRollNo = new Comparator<Student>() {

		@Override
		public int compare(Student st1, Student st2) {

			int st1Roll = st1.getRollno();
			int st2Roll = st2.getRollno();

			return st1Roll - st2Roll;
		}

	};

	public static Comparator<Student> StudentName = new Comparator<Student>() {

		@Override
		public int compare(Student st1, Student st2) {
			String st1Name = st1.getName();
			String st2Name = st2.getName();
			return st1Name.compareTo(st2Name);
		}

	};

}
