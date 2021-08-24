package trie;
//SANDIPAN  Mondal
import java.util.ArrayList;


public class Trie {
	
	// prevent instantiation
	private Trie() { }
	
	/**
	 * Builds a trie by inserting all words in the input array, one at a time,
	 * in sequence FROM FIRST TO LAST. (The sequence is IMPORTANT!)
	 * The words in the input array are all lower case.
	 * 
	 * @param allWords Input array of words (lowercase) to be inserted.
	 * @return Root of trie with all words inserted from the input array
	 */
	public static TrieNode buildTrie(String[] allWords) {
        
        int constant = 0;
        
        int aEI = num(constant);
        
        TrieNode rootNode = new TrieNode(null, null, null);
        if(allWords.length == 0)
            return rootNode;
        else
            rootNode.firstChild = new TrieNode(new Indexes(0, (short)(0), (short)(allWords[0].length() - 1)), null, null);
        TrieNode temp1 = rootNode.firstChild;
        
        
        int aWI = num(constant);
        TrieNode pointer = rootNode.firstChild;
    
        TrieNode previous = temp1;
            int aSI = num(constant);
        
        int var = -1;
        int x = 1;

        while(x < allWords.length) 
        { aWI = num(constant);
            String holder = allWords[x];
             aSI = num(constant);
            
            
             var= -1;
            int lengthofh = holder.length();
            previous = intialChildreferencer(rootNode);
            boolean value = pointer != null;
                 aEI = num(constant);
            if(value)
            {
            do{aEI = pointer.substr.endIndex;
        
                                
                aSI = pointer.substr.startIndex;

                boolean isaSIbiggerthanaholder = holder.length() < aSI;
            aWI = pointer.substr.wordIndex;
                if(!isaSIbiggerthanaholder) 
                {
                    int z = aSI;

                    String current2 = holder.substring(z);

                    String current1= allWords[aWI].substring(aSI, 1+aEI); //String OUT OF BOUNDS OF 0-4

                    int minumumValue =  Math.min(current1.length(), current2.length());

                    var = largestPrefixcount(current1, current2, minumumValue);
                    //infinite error occuring here -> FIIIXXXXX
                    var--;
                    if(true)
                    {
                    String hello = "IM SOOO BOOOOOORRRREEEEED";
                    String hello2 = "To do list: go out on a jog. FIGURE OUT HOW TO SPLIT NODES BY THURSDAY AND SUBMIT ON FRIDAY IF POSSIBLE";
                    
                    }

                    boolean frustrated = true;
                    for(int randomv= 0; randomv < 8; randomv++)
                    {
                        frustrated = true;
                        if(frustrated)
                            {
                                String what = "hi";
                            }
                    }
                    if(TestChecker1(var))
                    {
                        int y = aSI + var;
                        var = y;
                    }
                    if(TestChecker2(var))
                    {
                        previous = pointer;
                        TrieNode tem = pointer.sibling;
                        pointer = tem;
                        
                    }
                    else{
                        if(var == aEI) { 
                            previous = pointer;
                            TrieNode lol = pointer.firstChild;
                            pointer = lol;
                            
                        }else if (aEI > var){ 
                            previous = pointer;
                            break;
                        }
                    }
                }else
                {
                    previous = pointer;
                    pointer = pointer.sibling;
                }
            }while(!(pointer == null));
            }
            boolean conditiona = pointer != null;
            TrieNode randomh;
            randomh = previousFirstChild(previous);
            Indexes randoms = previousSubstring(previous);

            if(conditiona) {
                
                //FIX THIS ONE INCREMENT LOW
                short h1 = (short)(var+1);
                Indexes rand = new Indexes(randoms.wordIndex, h1, randoms.endIndex);
               
                randoms.endIndex = (short)var; 
                
                boolean frustrated = true;
                for(int randomv= 0; randomv < 8; randomv++)
                {
                    frustrated = true;
                    if(frustrated)
                        {
                            String what = "hi";
                        }
                }
                previous.firstChild = new TrieNode(rand, null, null);
                TrieNode temp = previousFirstChild(previous);
                temp.firstChild = randomh;
                
                short h2 = (short)(lengthofh-1);
                short shortx = (short)x;
                Indexes cool = new Indexes(shortx, h1, h2);

                previous.firstChild.sibling = new TrieNode(cool, null, null);


                
            } else {
                short asi = (short)aSI;


                Indexes what = new Indexes(x, asi, (short)(lengthofh-1));
                previous.sibling = new TrieNode(what, null, null);
            }
            
            boolean frustrated = true;
            for(int randomv= 0; randomv < 8; randomv++)
            {
                frustrated = true;
                if(frustrated)
                    {
                        String what = "hi";
                    }
            }
            pointer = initialch(rootNode);
            
            aSI = num(constant);

            aEI = num(constant);
            
            
            x++;
        }
        
        return rootNode;
    }

    private static int num(int num)
    {
        return num;
    }
    private static int largestPrefixcount(String one, String two, int minimum)
    {
        int counter = 0;
        for(int x = 0; x < minimum; x++)
        {
           
                if(one.charAt(x) != two.charAt(x))
                    return counter;
            
            if(one.charAt(x) == two.charAt(x))
               counter++;
        }
        return counter;
        
    }
    private static TrieNode initialch(TrieNode T)
    {
        TrieNode hol = T.firstChild;
        return hol;
    }
    private static TrieNode intialChildreferencer(TrieNode T)
    {
        TrieNode hol = T.firstChild;
        return hol;
    }
    private static boolean TestChecker1(int holder)
    {
        if(holder != -1)
            return true;
        return false;
    }
    private static boolean TestChecker2(int holder)
    {
        if(holder < 0)
            return true;
        return false;
    }

    private static Indexes previousSubstring (TrieNode Previous)
    {
        TrieNode holder = Previous;
        return holder.substr;
    }
    
    private static TrieNode previousFirstChild (TrieNode Previous)
    {   
        TrieNode holder = Previous;
        return holder.firstChild;
    }
    private static void change(TrieNode T)
    {
        T.firstChild = new TrieNode(null, null, null);
    
    }

	
	/**
	 * Given a trie, returns the "completion list" for a prefix, i.e. all the leaf nodes in the 
	 * trie whose words start with this prefix. 
	 * For instance, if the trie had the words "bear", "bull", "stock", and "bell",
	 * the completion list for prefix "b" would be the leaf nodes that hold "bear", "bull", and "bell"; 
	 * for prefix "be", the completion would be the leaf nodes that hold "bear" and "bell", 
	 * and for prefix "bell", completion would be the leaf node that holds "bell". 
	 * (The last example shows that an input prefix can be an entire word.) 
	 * The order of returned leaf nodes DOES NOT MATTER. So, for prefix "be",
	 * the returned list of leaf nodes can be either hold [bear,bell] or [bell,bear].
	 *
	 * @param root Root of Trie that stores all words to search on for completion lists
	 * @param allWords Array of words that have been inserted into the trie
	 * @param prefix Prefix to be completed with words in trie
	 * @return List of all leaf nodes in trie that hold words that start with the prefix, 
	 * 			order of leaf nodes does not matter.
	 *         If there is no word in the tree that has this prefix, null is returned.
	 */
	public static ArrayList<TrieNode> completionList(TrieNode root,
										String[] allWords, String prefix) {
											if (root == null)
											return null;
								
											
										ArrayList<TrieNode> storage = new ArrayList<>();
										TrieNode arrow = root;
										boolean conditiona = (arrow == null);
										if(!conditiona)
										{
											do{
												Indexes substrchecker = arrow.substr;
											if(substrchecker == null) 
											{
												TrieNode o = previousFirstChild(arrow);
												arrow = o;
											}
											boolean val = true;
											Indexes newsubstrchecker = arrow.substr;
											String[] arr = new String[4];
								int x = 10;
											int y = 0;
											while(x > 0)
											{ 
												// recursive function not working. Need another ocnditional statement 
												x--;
												y++;
												Boolean angry = true;
											}
											arr[0] = allWords[newsubstrchecker.wordIndex];
											arr[1] = arr[0].substring(0, newsubstrchecker.endIndex);
											String what = prefix;
											if(what.startsWith(arr[1])) {
												val = false;
												if(!(arrow.firstChild != null)) { 
													
													storage.add(arrow);
													arrow = arrow.sibling;
												} else {
													storage.addAll(completionList(arrow.firstChild, allWords, prefix));
													arrow = arrow.sibling;
												}
											}else if(arr[0].startsWith(what)) {
												val = false;
												if(!(arrow.firstChild != null)) { 
													
													storage.add(arrow);
													arrow = arrow.sibling;
												} else {
													storage.addAll(completionList(arrow.firstChild, allWords, prefix));
													arrow = arrow.sibling;
												}
											}
											if(val)
												arrow = arrow.sibling;
											}while(!(arrow == null));
											
										}
										
										if (root == null)
											return null;
										return storage;
										
									}
								
								
								
	
	public static void print(TrieNode root, String[] allWords) {
		System.out.println("\nTRIE\n");
		print(root, 1, allWords);
	}
	
	private static void print(TrieNode root, int indent, String[] words) {
		if (root == null) {
			return;
		}
		for (int i=0; i < indent-1; i++) {
			System.out.print("    ");
		}
		
		if (root.substr != null) {
			String pre = words[root.substr.wordIndex]
							.substring(0, root.substr.endIndex+1);
			System.out.println("      " + pre);
		}
		
		for (int i=0; i < indent-1; i++) {
			System.out.print("    ");
		}
		System.out.print(" ---");
		if (root.substr == null) {
			System.out.println("root");
		} else {
			System.out.println(root.substr);
		}
		
		for (TrieNode ptr=root.firstChild; ptr != null; ptr=ptr.sibling) {
			for (int i=0; i < indent-1; i++) {
				System.out.print("    ");
			}
			System.out.println("     |");
			print(ptr, indent+1, words);
		}
	}
 }
