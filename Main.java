class main {
    public static void main(String args[]) {
        int i, n;
        boolean k;
        for(i=2; i < 100; i++) {
            k = true;
            for (n=2; n <= i/n; n++)
                if((i%n) == 0) k = false;
            if (k)
                System.out.print(i + " ");
        }
    }
}