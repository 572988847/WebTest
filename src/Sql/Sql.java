package Sql;
import java.sql.*;

public class Sql {
	private String url;// ���ݿ��url
	private String user;// ���ݿ���û���
	private String password;// ���ݿ������
	private String script;// ���������ű�
	private int numofnodes;// �ڵ�����
	public Sql(String url, String user, String password){
		script = "sdfads";
		numofnodes = 0;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	private void InitTable(){
		// New A Table;
	}
	public void Addnode(String name, int parent,double value){
		// Insert A Record into Table;
	}
	public Node getNode(String name){
		// Find the Record with this Name;
		String nodeName;int parentId;double value;int nodeId;int numofChildren;
		Node node = new Node(nodeName,parentId,value,nodeId, numofChildren);
		return node;
	}
	
	public void showChildrenofNode(String name){
		// Show the Children of a Node with this Name
		int num = getNode(name).numofChildren;
		for(int i = 0; i < num; i ++){
			
		}
	}
}

