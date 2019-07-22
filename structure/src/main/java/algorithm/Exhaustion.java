package algorithm;


/**
 * 穷举算法 既 已知结果和公式 求问题解 的算法
 * 基本问题 ：鸡兔同笼
 *
 */
public class Exhaustion {
	
	/**
	 * 计算并打印 最终结果
	 * @param headers 一共多少头
	 * @param legs 一共有多少脚
	 */
	public void printCount(Integer headers,Integer legs)
	{
		Integer rabbits, chicken;
		Boolean flag = Boolean.TRUE;
		//穷举法计算既根据已知规则以及关系进行计算
		for(rabbits = 0;rabbits < headers;rabbits++ )
		{
			chicken = headers - rabbits;
			Integer legsCount = 2*chicken + 4*rabbits;
			if(legs.equals(legsCount))
			{
				System.out.printf("计算结果为=>\n\t鸡的数量: %d\n\t 兔子的数量: %d",chicken,rabbits);
				flag = Boolean.FALSE;
			}
		}
		if(flag)
		{
			System.out.println("无法计算该 参数条件下的鸡兔数量！");
		}
	}
}
