// package
package a.b.c.ch4;

// import


public class Interface_AImpl implements Interface_A 
{
	// @ : �ڹٿ��� ����ϴ� ������̼� ����̴�. 
	// ������̼� ����� �� ���� ��� 
	// 1. �Լ��� �����ϴ� ��� 
	// 2. ������ �����ϴ� ��� 
	
	// @Override : �������̵� ������̼� �̶�� �θ���.
	// �Լ��� �����ϴ� ��� : interface_a() �Լ��� 
	// Interface_A �������̽����� Interface_AImpl Ŭ������ �������̵� �ߴٴ� ����
	@Override
	public void interface_a(){
		System.out.println("Interface_AImpl.interface_a() �Լ� >>> : ");
	}

	@Override
	public int interface_b(){
		return 100;
	}

	@Override
	public String interface_c(){
		return "interface_c()";
	}

	@Override
	public boolean interface_d(){
		return false;
	}
}
