class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] pair = new int[position.length][2] ;
        for(int i=0;i<position.length;i++){
            pair[i][0] = position[i];
            pair[i][1] =speed[i] ;
        }

        Arrays.sort(pair,(a,b) ->{
            return Integer.compare(b[0],a[0]);
        });
        System.out.println(Arrays.deepToString(pair));

        Deque<Double> stack =  new ArrayDeque<>();

        for(int[] el : pair){
            double time = (double)(target-el[0])/el[1];

            if(!stack.isEmpty() && time <= stack.peekLast()){
               continue;
            }
            stack.addLast(time);

        }
        return stack.size();
    }
}
