package Threads;

class Tickets
{
	int availableTickets = 2;
	
	synchronized void bookTicket()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" Is Trying To Book Ticket...");
		
		if(availableTickets > 0)
		{
			System.out.println(name+" Is Got The Ticket...");
			availableTickets--;
			System.out.println("Remaining Ticket = "+availableTickets);
		}
		else
		{
			System.out.println(name+" Is Not Got The Ticket, Going wait by release Ticket..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			bookTicket();
		}
	}
	
	synchronized void cancelTicket()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" Is Trying To Cancel Ticket...");
		availableTickets++;
		notifyAll();
	}
}

class BookTicketThread extends Thread
{
	Tickets ticket;
	
	BookTicketThread(Tickets ticket)
	{
		this.ticket=ticket;
	}
	
	public void run()
	{
		ticket.bookTicket();
	}
}

class CancelTicketThread extends Thread
{
	Tickets ticket;

	public CancelTicketThread(Tickets ticket) 
	{
		this.ticket = ticket;
	}
	
	public void run()
	{
		ticket.cancelTicket();
	}
	
}
public class DeadlockExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Tickets ticket = new Tickets();
		
		BookTicketThread t1 = new BookTicketThread(ticket);
		BookTicketThread t2 = new BookTicketThread(ticket);
		BookTicketThread t3 = new BookTicketThread(ticket);
		BookTicketThread t4 = new BookTicketThread(ticket);
		BookTicketThread t5 = new BookTicketThread(ticket);
		
		CancelTicketThread t6 = new CancelTicketThread(ticket);
		CancelTicketThread t7 = new CancelTicketThread(ticket);
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");
		t6.setName("t6");
		t7.setName("t7");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		Thread.sleep(500);
		
		t6.start();
		t7.start();

	}

}
