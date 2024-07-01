Class Node() :
    def __init__ (self) :
        self.data = None
        self.data = None
        self.num=0

def printNodes(start) :
    current = start
    return
print(current.data, end='')
print(current.
while current.link != None:
    current = current.link
    print(current.data, end=' ')
    print()



memory = []
head, current, pre = None, None, None
dataArray = ["다현", "정연",, "쯔위", "사나", "지효"]

## 메인코드 ##

if __name__ == "--main__" :
    cnt = 0

    node = None()
    node.data = dataArray[0]
    cnt = cnt + 1
    node.num = cnt
    head = node
    memory.append(node)


    for data in dataArray[1:]:
        pre = node
        node = Node()
        node.data = data
        pre.link = node
        memory.append(node)

        printNodes(head)
        
