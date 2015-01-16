/* * ATM Example system - file Log.java * * copyright (c) 2001 - Russell C. Bjork * */ package application.domain;import application.domain.Message;import application.domain.Money;import application.domain.Status;import presentation.Simulation;/** Manager for the ATM's internal log.  In a real ATM, this would  *  manage a physical device; in this simulation,  it uses classes  *  in package simulation to simulate the device. */ public class Log{    /** Constructor     */    public Log()    {    }        /** Log the sending of a message to the bank     *     *  @param message the message to be logged     */    public void logSend(Message message)    {        Simulation.getInstance().printLogLine("메시지:   " + message.toString());     }        /** Log a response received from a message     *     *  @param status the status object returned by the bank in response     */    public void logResponse(Status response)    {        Simulation.getInstance().printLogLine("응답:  " + response.toString());    }        /** Log the dispensing of cash by the cash dispenser     *     *  @param amount the amount of cash being dispensed     */    public void logCashDispensed(Money amount)    {        Simulation.getInstance().printLogLine("지급된 액수: " + amount.toString());    }        /** Log accepting an envelope.  This method is only called if an envelope     *  is actually received from the customer     */    public void logEnvelopeAccepted()    {        Simulation.getInstance().printLogLine("봉투:  받음");    }}