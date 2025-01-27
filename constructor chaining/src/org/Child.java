package org;

class Child extends Parent
	{
		int a=30;

		void method() {
			System.out.println(super.a);
		}
		public static void main(String[] args) {
			GrandParent p=new Child();
			p.method();
		}
	}


