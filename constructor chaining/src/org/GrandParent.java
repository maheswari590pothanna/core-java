package org;

public class GrandParent {
	int a=10;

}
class Parent extends GrandParent
{
	int a=20;
}
class child extends Parent
{
	int a=30;

	void method() {
		System.out.println(super.a);
	}
}
