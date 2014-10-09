//Universidad del Valle de Guatemala
//Jefferson Silva (12605), Pablo samayoa(12635), Ixim Cojti (12697) , Carlos Cordero () 
//SplayTree.java
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class SplayTree
    {
        /**
         * Construct the tree.
         */
        public SplayTree( )
        {
            root = nullNode;
        }

        /**
         * Insert into the tree.
         * @param x the item to insert.
         */
        public void insert( Comparable x )
        {
            if( newNode == null )
                newNode = new NodoBin( null );
            newNode.element = x;

            if( root == nullNode )
            {
                newNode.left = newNode.right = nullNode;
                root = newNode;
            }
            else
            {
                root = splay( x, root );
                if( x.compareTo( root.element ) < 0 )
                {
                    newNode.left = root.left;
                    newNode.right = root;
                    root.left = nullNode;
                    root = newNode;
                }
                else
                if( x.compareTo( root.element ) > 0 )
                {
                    newNode.right = root.right;
                    newNode.left = root;
                    root.right = nullNode;
                    root = newNode;
                }
                else
                    return;
            }
            newNode = null;   // So next insert will call new
        }

        /**
         * Remove from the tree.
         * @param x the item to remove.
         */
        public void remove( Comparable x )
        {
            NodoBin newTree;

                // If x is found, it will be at the root
            root = splay( x, root );
            if( root.element.compareTo( x ) != 0 )
                return;   // Item not found; do nothing

            if( root.left == nullNode )
                newTree = root.right;
            else
            {
                // Find the maximum in the left subtree
                // Splay it to the root; and then attach right child
                newTree = root.left;
                newTree = splay( x, newTree );
                newTree.right = root.right;
            }
            root = newTree;
        }

        /**
         * Find the smallest item in the tree.
         * Not the most efficient implementation (uses two passes), but has correct
         *     amortized behavior.
         * A good alternative is to first call Find with parameter
         *     smaller than any item in the tree, then call findMin.
         * @return the smallest item or null if empty.
         */
        public Comparable findMin( )
        {
            if( isEmpty( ) )
                return null;

            NodoBin ptr = root;

            while( ptr.left != nullNode )
                ptr = ptr.left;

            root = splay( ptr.element, root );
            return ptr.element;
        }

        /**
         * Find the largest item in the tree.
         * Not the most efficient implementation (uses two passes), but has correct
         *     amortized behavior.
         * A good alternative is to first call Find with parameter
         *     larger than any item in the tree, then call findMax.
         * @return the largest item or null if empty.
         */
        public Comparable findMax( )
        {
            if( isEmpty( ) )
                return null;

            NodoBin ptr = root;

            while( ptr.right != nullNode )
                ptr = ptr.right;

            root = splay( ptr.element, root );
            return ptr.element;
        }

        /**
         * Find an item in the tree.
         * @param x the item to search for.
         * @return the matching item or null if not found.
         */
        public Comparable find( Comparable x )
        {
            root = splay( x, root );

            if( isEmpty( ) || root.element.compareTo( x ) != 0 )
                return null;

            return root.element;
        }

        /**
         * Make the tree logically empty.
         */
        public void makeEmpty( )
        {
            root = nullNode;
        }

        /**
         * Test if the tree is logically empty.
         * @return true if empty, false otherwise.
         */
        public boolean isEmpty( )
        {
            return root == nullNode;
        }

        /**
         * Print the tree contents in sorted order.
         */
        public void printTree( )
        {
            if( isEmpty( ) )
                System.out.println( "Empty tree" );
            else
                printTree( root );
        }

        /**
         * Internal method to perform a top-down splay.
         * The last accessed node becomes the new root.
         * @param x the target item to splay around.
         * @param t the root of the subtree to splay.
         * @return the subtree after the splay.
         */
        private NodoBin splay( Comparable x, NodoBin t )
        {
             NodoBin leftTreeMax, rightTreeMin;

            header.left = header.right = nullNode;
            leftTreeMax = rightTreeMin = header;

            nullNode.element = x;   // Guarantee a match

            for( ; ; )
                if( x.compareTo( t.element ) < 0 )
                {
                    if( x.compareTo( t.left.element ) < 0 )
                        t = rotateWithLeftChild( t );
                    if( t.left == nullNode )
                        break;
                    // Link Right
                    rightTreeMin.left = t;
                    rightTreeMin = t;
                    t = t.left;
                }
                else if( x.compareTo( t.element ) > 0 )
                {
                    if( x.compareTo( t.right.element ) > 0 )
                        t = rotateWithRightChild( t );
                    if( t.right == nullNode )
                        break;
                    // Link Left
                    leftTreeMax.right = t;
                    leftTreeMax = t;
                    t = t.right;
                }
                else
                    break;

            leftTreeMax.right = t.left;
            rightTreeMin.left = t.right;
            t.left = header.right;
            t.right = header.left;
            return t;
        }

        /**
         * Rotate binary tree node with left child.
         */
        static NodoBin rotateWithLeftChild( NodoBin k2 )
        {
            NodoBin k1 = k2.left;
            k2.left = k1.right;
            k1.right = k2;
            return k1;
        }

        /**
         * Rotate binary tree node with right child.
         */
        static NodoBin rotateWithRightChild( NodoBin k1 )
        {
            NodoBin k2 = k1.right;
            k1.right = k2.left;
            k2.left = k1;
            return k2;
        }

        /**
         * Internal method to print a subtree in sorted order.
         * WARNING: This is prone to running out of stack space.
         * @param t the node that roots the tree.
         */
        private void printTree( NodoBin t )
        {
            if( t != t.left )
            {
                printTree( t.left );
                System.out.println( t.element.toString( ) );
                printTree( t.right );
            }
        }


        private NodoBin root;
        private static NodoBin nullNode;
            static         // Static initializer for nullNode
            {
                nullNode = new NodoBin( null );
                nullNode.left = nullNode.right = nullNode;
            }

        private static NodoBin newNode = null;  // Used between different inserts
        private static NodoBin header = new NodoBin( null ); // For splay
}
