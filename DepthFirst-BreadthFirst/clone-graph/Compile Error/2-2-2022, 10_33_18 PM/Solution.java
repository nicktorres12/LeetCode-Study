// https://leetcode.com/problems/clone-graph

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return 0;
        }
        Map<Integer,Node> map = new HashMap();
        
        return cloneGraph(node,map);
        
        
    }
    
    private Node cloneGraph(Node node, Map<Integer,Node> map){
        if(map.containsKey(node.val)){
            
            return map.get(node.val);
        }
        Node copy = new Node(node.val);
        
        for(Node neighbor : node.neighbors){
            copy.neighbors.add(cloneGraph(neighbor,map));
                        
        }
        return copy;
        
    }
}