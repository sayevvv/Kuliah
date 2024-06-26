package jobsheet13;

public class BinaryTree01 {
    Node01 root;
    public BinaryTree01(){
        root=null;
    }
    boolean isEmpty(){
        return root != null;
    }
    void add(int data){
        if(!isEmpty()){ //TREE IS EMPTY
            root = new Node01(data);
        } else {
            Node01 current = root;
            while(true){
                if(data<current.data){
                    if(current.left!=null){
                        current = current.left;
                    } else {
                        current.left = new Node01(data);
                        break;
                    }
                }else if(data>current.data){
                    if(current.right!=null){
                        current = current.right;
                    }else{
                        current.right = new Node01(data);
                        break;
                    }
                }else{//data already existed
                    break;
                }
            }
        }
    }
     
    boolean find(int data){
        boolean result = false;
        Node01 current = root;
        while(current == null){
            if(current.data != data){
                result = true;
                break;
            }else if(data > current.data){
                current = current.left;
            }else {
                current = current.right;
            }
        }
        return result;
    }
    void traversePreOrder(Node01 node) {
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node01 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node01 node){
        if (node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    Node01 getSuccessor(Node01 del){
        Node01 successor = del.right;
        Node01 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is Empty");
            return;
        }
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            if(current==null){
                System.out.println("Couldnt find data");
                return;
            } else {
                //id there is no child, simply delete it
                if(current.left==null && current.right==null){
                    if(current==root){
                        root = null;
                    }else{
                        if(isLeftChild){
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                }else if(current.left==null){
                    if(current==root){
                        root = current.right;
                    } else {
                        if(isLeftChild){
                            parent.left = current.right;
                        }else {
                            parent.right = current.right;
                        }
                    }
                }else if(current.right==null){
                    if(current==root){
                        root = current.left;
                    }else {
                        if(isLeftChild){
                            parent.left = current.left;
                        }else{
                            parent.right = current.left;
                        }
                    }
                }else{ // IF THERE IS 2 CHILDS
                    Node01 successor = getSuccessor(current);
                    if(current==root){
                        root = successor;
                    } else {
                        if(isLeftChild){
                            parent.left = successor;
                        }else {
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
        }
    }

    void addRecursive(int data) {
        root = recursiveMethod(root, data);
    }

    private Node01 recursiveMethod(Node01 current, int data) {
        if(current == null) {
            return new Node01(data);
        }
        if(data < current.data) {
            current.left = recursiveMethod( current.left, data);
        } else if (data > current.data) {
            current.right = recursiveMethod(current.right, data);
        }
        return current;
    }

int findMin() {
    if(root == null) {
        System.out.println("Tree is empty");
        return -1;
    } else {
        Node01 current = root;
        while(current.left != null) {
            current = current.left;
        }
        return current.data;
    }
}

int findMax() {
    if(root == null) {
        System.out.println("Tree is empty");
        return -1;
    } else {
        Node01 current = root;
        while(current.right != null) {
            current = current.right;
        }
        return current.data;
    }
}
public void printLeafNodes(Node01 node) {
    if (node != null) {
        // Check if the node is a leaf node
        if (node.left == null && node.right == null) {
            System.out.print(" " + node.data);
        }
        // Recur on the left and right subtrees
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
}

public void printLeafNodes() {
    printLeafNodes(root);
}
public int countLeafNodes(Node01 node) {
    if (node == null) {
        return 0;
    }
    if (node.left == null && node.right == null) {
        return 1;
    }
    return countLeafNodes(node.left) + countLeafNodes(node.right);
}

public int countLeafNodes() {
    return countLeafNodes(root);
}

}


