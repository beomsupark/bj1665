import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		PriorityQueue<Integer> minheap = new PriorityQueue<>();//√÷º“»¸
		PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> b-a);//√÷¥Î»¸
		
		int count = Integer.parseInt(bf.readLine());
		for(int i =1;i<=count;i++)
		{
			
			int k = Integer.parseInt(bf.readLine());
			if(i%2==1)
			{
				maxheap.add(k);
			}
			else
			{
				minheap.add(k);
			}
			
			if(i>=2)
			{
				if(maxheap.peek()>minheap.peek())		
				{
					int temp = maxheap.poll();
					maxheap.add(minheap.poll());
					minheap.add(temp);
				}
			}
			bw.write(maxheap.peek()+"\n");
		}
		bw.flush();
	}
}
