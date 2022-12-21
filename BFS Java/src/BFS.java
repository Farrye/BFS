import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class BFS {
    
    public static Tree search(int value, Tree root)
    {
        Queue<Tree> queue = new ArrayDeque<>();
        queue.add(root);

        while(!queue.isEmpty())
        {
            System.out.print("Current queue: ");
            for (Tree item: queue){
                System.out.print(item.getValue() + ", ");
            }
            System.out.println();
            
            Tree currentNode = queue.remove();

            if(currentNode.getValue() == value)
            {
                System.out.println("Finished searching!");
                return currentNode;
            }
            else{
                queue.addAll(currentNode.getChildren());
            }
        }
        return null;
    }
    public static void main (String[] args)
    {
        Random random = new Random();

        Tree root = new Tree(1);
        Tree newChild = root.addChild(2);
        root.addChild(3);
        root.addChild(4);
        
        Tree grandChild = newChild.addChild(5);
        grandChild.addChild(6);
        grandChild.addChild(7);
        
        

        Tree foundNode = search(random.nextInt(7 + 1), root);


        if(foundNode != null)
        {
            System.out.println(foundNode.getValue());
        }else
        {
            System.out.println("Encontrou não");
        }
    }
}
