
/*
 * Break & Continue
 * -unlabeled
 * -labeled
 */
public class BranchingStatement {
	
	String str="Wikinews is a free-content news wiki and a project of the Wikimedia Foundation. The site works through collaborative journalism. Wikipedia co-founder Jimmy Wales has distinguished Wikinews from Wikipedia by saying on Wikinews, each story is to be written as a news story as opposed to an encyclopedia article.";
// example of unlabeled branching statement - Break
	void findIt_BreakStatement_Unlabeled()
	{
		int [] arryInt= {32,58,97,45,75,94,71,32,46};
		int search=94;
		int i;
		boolean foundIt=false;
		for(i=0;i<arryInt.length;i++)
		{
			if(arryInt[i]==search)
			{
				foundIt=true;
				break; // unlabeled break
				
			}// end if
		} // end outer for
		
		if(foundIt)
		{
			System.out.println("Found "+search+" at Array index "+i);
		}
		else {
			System.out.println(search+" not found in Array...");
		}
	} //end findIt_BreakStatement_Unlabeled()
	
	
// example of labeled branching statement - Break	
	
	void findIt_BreakStatement_labeled()
	{
		int[][] arrayTwoDim= {{32,8,7,3,589},{12,1076,2000,9},{13,1086,4000,7}};
		int find=9;
		int i;
		int j=0;
		boolean found=false;
		
		search:
			for(i=0;i<arrayTwoDim.length;i++)
			{
				for(j=0;j<arrayTwoDim[i].length;j++)
				{
					if(arrayTwoDim[i][j]==find)
					{
						found=true;
						break search; // labeled Break
					}
				} // end inner loop
			}// end outer for loop
		
		if(found)
		{
			System.out.println("Found "+find+" at  "+i+" , "+j);
		}
		else {
			System.out.println(find+" not found in Array...");
		}
		
	} //  end findIt_BreakStatement_labeled()
	

	void findChar_ContinueStatement_Unlabeled()
	{
		//String str="Wikinews is a free-content news wiki and a project of the Wikimedia Foundation. The site works through collaborative journalism. Wikipedia co-founder Jimmy Wales has distinguished Wikinews from Wikipedia by saying on Wikinews, each story is to be written as a news story as opposed to an encyclopedia article.";
		int max=str.length();
		int numCharCount=0;
		for(int i=0;i<max;i++)
		{
			if(str.charAt(i)!='n')
			{
				continue; // unlabeled continue
			} // end if
			
			numCharCount++;	
		} // end for
		
		System.out.println("Found "+numCharCount+" n in string using unlabeled continue statement");
	} // end findChar_ContinueStatement_Unlabeled()
	
	
void findChar_ContinueStatement_labeled()
{
	//String str="Wikinews is a free-content news wiki and a project of the Wikimedia Foundation. The site works through collaborative journalism. Wikipedia co-founder Jimmy Wales has distinguished Wikinews from Wikipedia by saying on Wikinews, each story is to be written as a news story as opposed to an encyclopedia article.";
   String subString="and";
   boolean foundIt=false;
   int max=str.length()-subString.length();
   findStr:
	   for(int i=0;i<=max;i++)
	   {
		int n =subString.length();
		int j=i;
		int k=0;
		while(n-- !=0)
		{
			if(str.charAt(j++)!=subString.charAt(k++))
			{
				continue findStr; // labeled continue
			} // end if
			
		} // end inner while loop
		
		foundIt=true;
		break findStr; // labeled break
	   } // end outer for loop
   
   System.out.println(foundIt?"Found It..":" Didnt Found It.."); // Ternary

	
} // end findChar_ContinueStatement_labeled()
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BranchingStatement obj=new BranchingStatement();
		
		obj.findIt_BreakStatement_Unlabeled();
		obj.findIt_BreakStatement_labeled();
		obj.findChar_ContinueStatement_Unlabeled();
		obj.findChar_ContinueStatement_labeled();

	}// end main()

} // end class BranchingStatement
