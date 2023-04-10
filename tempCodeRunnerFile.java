  for (int floor = max; floor >= 1; floor--) {
        for (int i = 1; i <= n; i++) {
        if (num[i] >= floor) {
        System.out.print("*\t ");
        } else {
        System.out.println("\t");
        }
        }
        }