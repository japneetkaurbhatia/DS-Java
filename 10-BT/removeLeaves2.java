public static void removeLeaves(Node node, Node par) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            if (par.left == node)
                par.left = null;
            else
                par.right = null;

            return;
        }

        removeLeaves(node.left, node);
        removeLeaves(node.right, node);
    }

    public static Node removeLeaves(Node node) {
        if (node.left == null && node.right == null)
            return null;
        removeLeaves(node, null);

        return node;
    }