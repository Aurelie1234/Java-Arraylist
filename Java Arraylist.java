public static void main(String[] args) {
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner sc = new Scanner(System.in);
      
ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
int n = sc.nextInt();
ArrayList<Integer> temp = null;
      
for(int i = 0 ; i < n ; i++) {


  int d = sc.nextInt();
   temp = new ArrayList<>();


   for(int j = 0 ; j < d ; j++) {
       temp.add(sc.nextInt());
   }


   arr.add(temp);
}
      
int q = sc.nextInt();


for(int i = 0 ; i < q ; i++) {


   int x = sc.nextInt();
   int y = sc.nextInt();
          
   try {
       System.out.println(arr.get(x - 1).get(y - 1));
   } catch(Exception e) {
       System.out.println("ERROR!");
   }


}
   }
