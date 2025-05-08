class Grafoamg{
    // ATRIBUTES
    boolean matrix[][] = new boolean[7][3];

    // METHODS
    private void add(int origin, int destiny) {
        this.matrix[origin][destiny] = true;
        this.matrix[destiny][origin] = true;
    }
}