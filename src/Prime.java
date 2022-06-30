class Prime {

        void checkPrime(int... n) {
        for (int num : n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }

     boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) return false;
        }
        return true;
    }
}
