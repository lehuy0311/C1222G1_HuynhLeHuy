package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.repository.contract.ContractRepository;
import case_study.repository.contract.IContractRepository;
import case_study.utils.ReadFileBooking;
import case_study.utils.ReadFileContract;

import java.util.*;

public class ContractService implements IContractService{
    List<Contract> contracts = ReadFileContract.read();
    IContractRepository iContractRepository = new ContractRepository();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void edit() {

        Contract editedContract;
        double deposit;
        double total;

        System.out.println("Enter contract ID here to edit:");
        int contractID = Integer.parseInt(scanner.nextLine());
        int index = iContractRepository.edit(contractID);
        if(index == -1) System.out.println("There is no contract matching your input ID!");
        else {
            editedContract = contracts.get(index);
            System.out.println(editedContract);

            System.out.println("You only can edit the deposit and total amount of this contract!");

            System.out.println("Please enter the amount of your deposit here:");
            deposit = Double.parseDouble(scanner.nextLine());

            System.out.println("Please enter the total amount here:");
            total = Double.parseDouble(scanner.nextLine());

            editedContract.setDeposit(deposit);
            editedContract.setTotal(total);
            contracts.set(index, editedContract);
            iContractRepository.add(contracts);
            System.out.println("Contract edited!");
        }


    }

    @Override
    public void delete() {


        System.out.println("Enter contract ID here to delete:");
        int contractID = Integer.parseInt(scanner.nextLine());
        int index = iContractRepository.delete(contractID);
        if(index == -1) {
            System.out.println("Cannot find this contract ID!");
        } else {
            System.out.println(contracts.get(index));
            System.out.println("Are you sure to delete this contract? \n" +
                    "1 - Yes \n" +
                    "2 or Other - No ");
            String cf = scanner.nextLine();
            if(cf.equals("1")){
                contracts.remove(index);
                iContractRepository.add(contracts);
                System.out.println("Contract deleted successfully!");
            } else System.out.println("Nothing changed!");

        }
    }

    @Override
    public void display() {
        if(contracts.isEmpty()) System.out.println("There is no contract in the system!");
        else {
            System.out.println("***List of Contracts:");
            for (Contract contract: contracts) {
                System.out.println(contract);
            }
        }
    }

    @Override
    public void add() {

        // add all contracts to queue
        Queue<Booking> contractQueue = new LinkedList<>(ReadFileBooking.read());

        // then remove all elements in contract
        contracts = new ArrayList<>();

        int contractID;
        String bookingID;
        int customerID;
        double deposit;
        double total;
        Booking booking;
        Contract newContract;


        System.out.println("There are " + contractQueue.size() + " contracts to make!");
        for (int i = 0; i < ReadFileBooking.read().size(); i++) {

            booking = contractQueue.poll();

            bookingID = booking.getBookingID();
            System.out.println("You are making a contract for booking no." +bookingID);


            customerID = booking.getCustomerID();
            System.out.println("You are making a contract for customer with ID: " + customerID);

            System.out.println("Enter contract ID here:");
            contractID = Integer.parseInt(scanner.nextLine());

            System.out.println("Please enter the amount of your deposit here:");
            deposit = Double.parseDouble(scanner.nextLine());


            System.out.println("Please enter the total amount here:");
            total = Double.parseDouble(scanner.nextLine());

            newContract = new Contract(contractID, bookingID, customerID, deposit, total);
            contracts.add(newContract);
            System.out.println("New contract added!");
            System.out.println("There are/is " + contractQueue.size() + " contracts to make left!");
        }

        System.out.println("All contracts are made!");
        iContractRepository.add(contracts);

    }
}
