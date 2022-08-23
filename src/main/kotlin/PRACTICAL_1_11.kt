fun displayProduct(product: Array <IntArray>) {
    println("Product of two matrices is: ")
    for (row in product) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

fun multiplyMatrices(firstMatrix: Array <IntArray>,
                     secondMatrix: Array <IntArray>,
                     r1: Int,
                     c1: Int,
                     c2: Int): Array <IntArray> {
    val product = Array(r1) { IntArray(c2) }
    for (i in 0..r1 - 1) {
        for (j in 0..c2 - 1) {
            for (k in 0..c1 - 1) {
                product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }

    return product
}

fun main(){
    val rows = 3
    val columns = 2
    val firstMatrix = arrayOf(intArrayOf(6, 3), intArrayOf(9,0), intArrayOf(5, 4))
    val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(9, 0), intArrayOf(0, 4))

    println("Matrix1: (3 * 2 Matrix): ")
    for (row in firstMatrix) {
        for (column in row) {
            print("$column   ")
        }
        println()
    }
    println("Matrix2: (3 * 2 Matrix): ")
    for (row in secondMatrix) {
        for (column in row) {
            print("$column   ")
        }
        println()
    }

    val sum = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }

    // Displaying the result
    println("Addition: (3 * 2 Matrix): ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }

    val sab = Array(rows) { IntArray(columns) }
    for (i in 0..rows - 1) {
        for (j in 0..columns - 1) {
            sab[i][j] = firstMatrix[i][j] - secondMatrix[i][j]
        }
    }
    // Displaying the result
    println("Subtraction: (3 * 2 Matrix): ")
    for (row in sab) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }

    val r1 = 2
    val c1 = 3
    val r2 = 3
    val c2 = 2
    val firstMatrixx = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
    val secondMatrixx = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))

    val product = multiplyMatrices(firstMatrixx,
        secondMatrixx,
        r1,
        c1,
        c2)

    // Displaying the result
    displayProduct(product)

}