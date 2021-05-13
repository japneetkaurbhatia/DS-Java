public static class isBSTSolPair {
        int maxEle = -(int) 1e8;
        int minEle = (int) 1e8;
        boolean isBST = true;

        boolean isBal = true;
        int height = -1;

        int largestBSTSize = 0;
        Node largestBSTNode = null;

        int totalNoOfBST = 0;
    }

    public static isBSTSolPair allsolution(Node node) {
        if (node == null) {
            return new isBSTSolPair();
        }

        isBSTSolPair left = allsolution(node.left);
        isBSTSolPair right = allsolution(node.right);

        isBSTSolPair ans = new isBSTSolPair();

        ans.isBST = left.isBST && right.isBST && left.maxEle < node.data && node.data < right.minEle;
        ans.isBal = left.isBal && right.isBal && Math.abs(left.height - right.height) <= 1;

        ans.maxEle = Math.max(node.data, right.maxEle);
        ans.minEle = Math.min(node.data, left.minEle);
        ans.height = Math.max(left.height, right.height) + 1;

        ans.totalNoOfBST = left.totalNoOfBST + right.totalNoOfBST + (ans.isBST ? 1 : 0);

        if (ans.isBST) {
            ans.largestBSTNode = node;
            ans.largestBSTSize += left.largestBSTSize + right.largestBSTSize + 1;
        } else {
            if (left.largestBSTSize > right.largestBSTSize) {
                ans.largestBSTNode = left.largestBSTNode;
                ans.largestBSTSize = left.largestBSTSize;
            } else {
                ans.largestBSTNode = right.largestBSTNode;
                ans.largestBSTSize = right.largestBSTSize;
            }
        }

        return ans;
    }