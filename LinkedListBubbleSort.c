void sort(struct list_ent *node) {
	
	struct list_ent *counter = malloc(sizeof(struct list_ent));
	counter = node;
	int linkedListLength = 1;
	while (counter != NULL) {
		linkedListLength = linkedListLength + 1;
		counter = counter->next;
	}
	
	struct list_ent *before = malloc(sizeof(struct list_ent));
	struct list_ent *swapOne = malloc(sizeof(struct list_ent));
	struct list_ent *swapTwo = malloc(sizeof(struct list_ent));
	
	int forLoopCounter;
	
	for (forLoopCounter = 0; forLoopCounter < linkedListLength; forLoopCounter++)
	{
		before = head;
		swapOne = before->next;
		swapTwo = before->next->next;
		
		/*All of the possible scenarios in which you would have to switch the values*/
		if ( strcmp(before->last, swapOne->last) > 0 ) {
			head = swapOne;
			swapOne = before;
			before = head;
			before->next = swapOne;
			swapOne->next = swapTwo;
		}
		
		while (swapTwo != NULL) {
			
			if (strcmp(swapOne->last, swapTwo->last) > 0 ) {
				before->next = swapTwo;
				swapOne->next = swapTwo->next;
				swapTwo->next = swapOne;
				swapTwo = swapOne;
				swapOne = before->next;
			}
			before = before->next;
			swapOne = swapOne->next;
			swapTwo = swapTwo->next;
		}
	}
};