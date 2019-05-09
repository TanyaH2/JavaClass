package com.class23;

public class Test {
	public static void main(String[] args) {

		System.out.println("\n-------------Employee-----------");
		Employee emp = new Employee();
		System.out.println(Employee.department);
		Employee.work();
		// emp.work(); - NOT preferred way!
		emp.salary = 90000;
		emp.getPaid();

		System.out.println("\n-------------Creating Scrum Team-----------");
		ScrumTeam st = new ScrumTeam();
		ScrumTeam.work();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		st.workOnArtifacts();
		st.attendScrumMeetings();

		System.out.println("\n-------------Developer-----------");
		Developer dev = new Developer();
		Developer.work();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Product Backlog";
		dev.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();

		System.out.println("\n-------------Tester-----------");
		Tester te = new Tester();
		Tester.work();
		te.salary = 76000;
		te.getPaid();
		te.artifacts = "Sprint Backlog";
		te.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		te.workOnArtifacts();
		te.attendScrumMeetings();
		te.test();

		System.out.println("\n-------------Scrum  Master-----------");
		ScrumMaster sm = new ScrumMaster();
		ScrumMaster.work();
		sm.salary = 95000;
		sm.getPaid();
		sm.artifacts = "BurnDown Chart";
		sm.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.scrumMeetings();

		System.out.println("\n-------------Business Analyst-----------");
		BA ba = new BA();
		BA.work();
		ba.salary = 120000;
		ba.getPaid();
		ba.artifacts = "Product Backlog, Sprint Backlog,";
		ba.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.userStories();

		System.out.println("\n-------------Product  Owner-----------");
		ProductOwner po = new ProductOwner();
		ProductOwner.work();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Product Backlog, Sprint Backlog";
		po.ceremonies = "Sprint Grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.talksToClient();
		po.prioritizeBacklog();

		System.out.println("\n-------------FrontEndDev-----------");
		FrontEndDev frontEnd = new FrontEndDev();
		FrontEndDev.work();
		frontEnd.salary = 1150000;
		frontEnd.getPaid();
		frontEnd.artifacts = "Product Backlog";
		frontEnd.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		frontEnd.workOnArtifacts();
		frontEnd.attendScrumMeetings();
		frontEnd.code();
		frontEnd.doHtml();

		System.out.println("\n-------------BackEndDev-----------");
		BackEndDev backEnd = new BackEndDev();
		BackEndDev.work();
		backEnd.salary = 1130000;
		backEnd.getPaid();
		backEnd.artifacts = "Product Backlog";
		backEnd.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		backEnd.workOnArtifacts();
		backEnd.attendScrumMeetings();
		backEnd.code();
		backEnd.doSql();

		System.out.println("\n-------------Manual Tester-----------");
		ManualTester mt = new ManualTester();
		ManualTester.work();
		mt.salary = 73000;
		mt.getPaid();
		mt.artifacts = "Sprint Backlog";
		mt.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.test();
		mt.testManualy();

		System.out.println("\n-------------Automation Tester-----------");
		AutomationTester at = new AutomationTester();
		AutomationTester.work();
		at.salary = 89000;
		at.getPaid();
		at.artifacts = "Sprint Backlog";
		at.ceremonies = "Sprint Grooming, Sprint Planning, Daily  StandUp, Sprint Demo, Sprint Retro ";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.test();
		at.codeInJava();

	}
}
