class Approach1 {
    public int maxScore(String s) {
        //1. find all ones
        int ones = 0 ;
        int n=s.length();
        //find max partitiion
        int maxDiff = -1;
        int zeros=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)== '0') zeros++;
            else ones++;
            maxDiff = Math.max(maxDiff ,zeros-ones );
        }
        if(s.charAt(n-1)=='1') ones++;
        return (maxDiff + ones);
    }
}