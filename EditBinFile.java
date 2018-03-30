/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package editbinfile;

import binfileutils.BinDecoder;
import binfileutils.BinEncoder;
import binfileutils.XBTProfile;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author pena
 */
public class EditBinFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        XBTProfile xBTProfileIn;
        XBTProfile xBTProfileOut = null;
//Call Sign                      | 9HA2072
//Latitude                       | 32 35.90 N
//Longitude                      | 047 29.01 W
//Transect Name                  | AX07
//Transect Number                | 0
//Sequence Number                | 160
//Year                           | 2016
//Month                          | 03
//Day                            | 24
//Hour                           | 04
//Minute                         | 15
//Ship Name                      | CMA CGM MOLIERE
//IMO Number                     | 9401099
//SEAS ID                        | 4AC81578
//SEAS Version                   | 930
//Probe Serial Number            | 1227259
//Probe Manufacture Date         | 01/01/1970
//Data Type                      | 1 (Full Resolution)
//Data Quality                   | 0 (Data Not Suspect)
//Deployment Height (meters)     | 8.80
//Ship Direction                 | 086
//Ship Speed (knots)             | 16.00
//Instrument Type                | Sippican Deep Blue (Code 52)
//Recorder Type                  | Sippican MK-21 (Code 6)
//Wind Instrument Type           | 15
//Wind Direction                 | 511.0
//Wind Speed (knots)             | 409.5
//Dry Bulb Temperature (celsius) | -1.05
//Current Measurement Method     | 7
//Current Direction              | 511
//Current Speed (knots)          | 81.91
//Total Water Depth (meters)     | 0
//XBT Launcher Type              | AOML XBT V8.1 Autolauncher (up to 8 Deep Blue and Fast Deep probes)
//XBT Recorder Serial Number     | 00000000
//XBT Recorder Manufacture Date  | 01/01/1970
//Agency in charge of Operation  | USA, NOAA Atlantic Oceanographic and Meteorological Laboratories (AOML)
//Ship Rider                     | Grant Rawson
//Ship Rider Institution         | AOML
//Ship Rider Email               | grant.rawson@noaa.gov
//Ship Rider Telephone Number    | 305-361-4363
//===================================================================


        // create the command line parser
        String help;
        String inFile;
        String outFile;
        String callsign;
        String messagetype;
        String latitude;
        String longitude;
        String transectname;
        String transectnum;
        String sequencenum;
        String year;
        String month;
        String day;
        String hour;
        String minute;
        String shipname;
        String imo;
        String seasversion;
        String probeserial;
        String probeyear;
        String probemonth;
        String probeday;
        String datatype;
        String dataquality;
        String height;
        String shipdir;
        String shipspeed;
        String probetype;
        String recorder;
        String windtype;
        String winddir;
        String windspeed;
        String drybulbtemp;
        String currentmethod;
        String currentdir;
        String currentspeed;
        String launcher;
        String recorderserial;
        String recorderyear;
        String recordermonth;
        String recorderday;
        String agency;
        String rider;
        String riderphone;
        String rideremail;
        String institution;
        String depth;
        String[] stringTemps;

        CommandLineParser parser = new DefaultParser();
// create the Options
        Options options = new Options();
        options.addOption("help", false, "this screen.");
        options.addOption("i", true, "input file.");
        options.addOption("o", true, "output file name.");
        options.addOption("callsign", true, "the ship's callsign.");
        options.addOption("messagetype", true, "a number denoting the bin files message type.");
        options.addOption("latitude", true, "latitude in decimal degress.");
        options.addOption("longitude", true, "longitude in decimal degrees.");
        options.addOption("transectname", true, "the name give to the transect. e.g. AX07");
        options.addOption("transectnum", true, "the number that denotes which transect in the total number of transects for the year.");
        options.addOption("sequencenum", true, "the number that denotes which xbt in the total number of xbts used for this cruise.");
        options.addOption("year", true, "four digit number for the year the probe was used.");
        options.addOption("month", true, "two digit number for the month the probe was used.");
        options.addOption("day", true, "two digit number for the day the probe was used.");
        options.addOption("hour", true, "two digit number for the hour the probe was used.");
        options.addOption("minute", true, "two digit number for the minute the probe was used.");
        options.addOption("shipname", true, "the ship's name");
        options.addOption("imo", true, "the ships IMO number");
        options.addOption("seasversion", true, "the three digit integer that denotes the version of amverseas used.");
        options.addOption("probeserial", true, "the xbt's serial number");
        options.addOption("probeyear", true, "four digit number for the year the probe was manufactured.");
        options.addOption("probemonth", true, "two digit number for the monthe the probe was manufactured.");
        options.addOption("probeday", true, "two digit number for the day the probe was manufactured.");
        options.addOption("datatype", true, "a number that denotes the type of data. e.g. full resolution, two meter resolution ect...");
        options.addOption("dataquality", true, "a number that denotes the quality of the data. e.g. was the data good");
        options.addOption("height", true, "a decimal number that denotes the height from the launch was made.");
        options.addOption("shipdir", true, "a decimal number that denotes the ships direction");
        options.addOption("shipspeed", true, "a decimal number in m/s that denotes the ships speed");
        options.addOption("probetype", true, "a number that denotes the type of XBT used.");
        options.addOption("recorder", true, "a number that denotes the type of recorder used.");
        options.addOption("windtype", true, "a number that denotes the type of instrument used to make the wind measurement.");
        options.addOption("winddir", true, "a number that denotes the wind direction.");
        options.addOption("windspeed", true, "a decimal number in m/s that denotes the wind speed.");
        options.addOption("drybulbtemp", true, "a decimal number in K that denotes the dry bulb temperature.");
        options.addOption("currentmethod", true, "a number that denotes the sea surface current measurement method.");
        options.addOption("currentdir", true, "a decimal number that denotes the sea surface current direction.");
        options.addOption("currentspeed", true, "a decimal number that denotes the sea surface current speed.");
        options.addOption("launcher", true, "a number that denotes the type of launcher used.");
        options.addOption("recorderserial", true, "a number that denotes the serial number for the recording device.");
        options.addOption("recorderyear", true, "four digit number for the year the recorder was manufactured");
        options.addOption("recordermonth", true, "two digit number for the monthe the recorder was manufactured.");
        options.addOption("recorderday", true, "two digit number for the monthe the recorder was manufactured.");
        options.addOption("agency", true, "a number denoting the agency in charge of operating the observation platform.");
        options.addOption("rider", true, "the rider(s) name.");
        options.addOption("riderphone", true, "the rider(s) phone numbers.");
        options.addOption("rideremail", true, "the rider(s) emails.");
        options.addOption("institution", true, "the rider(s) institution.");
        options.addOption("depth", true, "the total water depth.");
        options.addOption("temps", true, "temperature points delimited by \"@\"");
        // create the parser
        try {
            // parse the command line arguments
            CommandLine line = parser.parse(options, args);

            if (line.hasOption("help")) {

                printHelp(options);
                System.exit(0);

            }//end if          

            if (line.hasOption("i")) {
                inFile = line.getOptionValue("i");
                BinDecoder decodedXBTProfile = new BinDecoder(inFile);
                xBTProfileIn = decodedXBTProfile.getXBTProfile();
                xBTProfileOut = xBTProfileIn;

            }//end if
            else {
                printHelp(options);
                throw new ParseException("must provide an input file. use -i filename");

            }//end else

            if (line.hasOption("callsign")) {
                callsign = line.getOptionValue("callsign");
                xBTProfileOut.setCallsign(callsign);
                
            }//end if 
            if (line.hasOption("messagetype")) {
                messagetype = line.getOptionValue("messagetype");
                xBTProfileOut.setNewMessageType(Integer.parseInt(messagetype));
                
            }//end if             
            if (line.hasOption("latitude")) {
                latitude = line.getOptionValue("latitude");
                xBTProfileOut.setLatitude(Double.parseDouble(latitude));

            }//end if 
            if (line.hasOption("longitude")) {
                longitude = line.getOptionValue("longitude");
                xBTProfileOut.setLongitude(Double.parseDouble(longitude));

            }//end if 
            if (line.hasOption("transectname")) {
                transectname = line.getOptionValue("transectname");
                xBTProfileOut.setSoopLine(transectname);

            }//end if 
            if (line.hasOption("transectnum")) {
                transectnum = line.getOptionValue("transectnum");
                xBTProfileOut.setTransectNum(Integer.parseInt(transectnum));

            }//end if 
            if (line.hasOption("sequencenum")) {
                sequencenum = line.getOptionValue("sequencenum");
                xBTProfileOut.setSequenceNum(Integer.parseInt(sequencenum));

            }//end if 
            if (line.hasOption("year")) {
                year = line.getOptionValue("year");
                xBTProfileOut.setYear(Integer.parseInt(year));

            }//end if 
            if (line.hasOption("month")) {
                month = line.getOptionValue("month");
                xBTProfileOut.setMonth(Integer.parseInt(month));

            }//end if 
            if (line.hasOption("day")) {
                day = line.getOptionValue("day");
                xBTProfileOut.setDay(Integer.parseInt(day));

            }//end if 
            if (line.hasOption("hour")) {
                hour = line.getOptionValue("hour");
                xBTProfileOut.setHour(Integer.parseInt(hour));

            }//end if 
            if (line.hasOption("minute")) {
                minute = line.getOptionValue("minute");
                xBTProfileOut.setMinute(Integer.parseInt(minute));

            }//end if 
            if (line.hasOption("shipname")) {
                shipname = line.getOptionValue("shipname");
                xBTProfileOut.setShipName(shipname);

            }//end if 
            if (line.hasOption("imo")) {
                imo = line.getOptionValue("imo");
                xBTProfileOut.setLloyds(Integer.parseInt(imo));

            }//end if 
            if (line.hasOption("seasversion")) {
                seasversion = line.getOptionValue("seasversion");
                xBTProfileOut.setSeasVersion(Integer.parseInt(seasversion));

            }//end if 
            if (line.hasOption("probeserial")) {
                probeserial = line.getOptionValue("probeserial");
                xBTProfileOut.setProbeSerialNumber(Integer.parseInt(probeserial));

            }//end if 
            if (line.hasOption("probeyear")) {
                probeyear = line.getOptionValue("probeyear");
                xBTProfileOut.setXBTProbeManufacturedYear(Integer.parseInt(probeyear));

            }//end if 
            if (line.hasOption("probemonth")) {
                probemonth = line.getOptionValue("probemonth");
                xBTProfileOut.setXBTProbeManufacturedMonth(Integer.parseInt(probemonth));

            }//end if 
            if (line.hasOption("probeday")) {
                probeday = line.getOptionValue("probeday");
                xBTProfileOut.setXBTProbeManufacturedDay(Integer.parseInt(probeday));

            }//end if 
            if (line.hasOption("datatype")) {
                datatype = line.getOptionValue("datatype");
                xBTProfileOut.setThisDataIs(Integer.parseInt(datatype));

            }//end if 
            if (line.hasOption("dataquality")) {
                dataquality = line.getOptionValue("dataquality");
                xBTProfileOut.setDataQuality(Integer.parseInt(dataquality));

            }//end if 
            if (line.hasOption("height")) {
                height = line.getOptionValue("height");
                xBTProfileOut.setLaunchHeight(Double.parseDouble(height));

            }//end if 
            if (line.hasOption("shipdir")) {
                shipdir = line.getOptionValue("shipdir");
                xBTProfileOut.setShipDirection(Double.parseDouble(shipdir));

            }//end if 
            if (line.hasOption("shipspeed")) {
                shipspeed = line.getOptionValue("shipspeed");
                xBTProfileOut.setShipSpeed(Double.parseDouble(shipspeed));

            }//end if 
            if (line.hasOption("probetype")) {
                probetype = line.getOptionValue("probetype");
                xBTProfileOut.setInstrumentType(Integer.parseInt(probetype));

            }//end if 
            if (line.hasOption("recorder")) {
                recorder = line.getOptionValue("recorder");
                xBTProfileOut.setRecorderType(Integer.parseInt(recorder));

            }//end if 
            if (line.hasOption("windtype")) {
                windtype = line.getOptionValue("windtype");
                xBTProfileOut.setWindInstrumentType(Integer.parseInt(windtype));

            }//end if 
            if (line.hasOption("winddir")) {
                winddir = line.getOptionValue("winddir");
                xBTProfileOut.setWindDirection(Double.parseDouble(winddir));

            }//end if 
            if (line.hasOption("windspeed")) {
                windspeed = line.getOptionValue("windspeed");
                xBTProfileOut.setWindSpeed(Double.parseDouble(windspeed));

            }//end if 
            if (line.hasOption("drybulbtemp")) {
                drybulbtemp = line.getOptionValue("drybulbtemp");
                xBTProfileOut.setDryBulbTemperature(Double.parseDouble(drybulbtemp));

            }//end if 
            if (line.hasOption("currentmethod")) {
                currentmethod = line.getOptionValue("currentmethod");
                xBTProfileOut.setSeaSurfaceCurrentMeasurementMethod(Integer.parseInt(currentmethod));
                
            }//end if 
            if (line.hasOption("currentdir")) {
                currentdir = line.getOptionValue("currentdir");
                xBTProfileOut.setSeaSurfaceCurrentDirection(Integer.parseInt(currentdir));
                
            }//end if 
            if (line.hasOption("currentspeed")) {
                currentspeed = line.getOptionValue("currentspeed");
                xBTProfileOut.setSeaSurfaceCurrentSpeed(Double.parseDouble(currentspeed));
                
            }//end if 
            if (line.hasOption("launcher")) {
                launcher = line.getOptionValue("launcher");
                xBTProfileOut.setXBTLauncherType(Integer.parseInt(launcher));
                
            }//end if    
            if (line.hasOption("recorderserial")) {
                recorderserial = line.getOptionValue("recorderserial");
                xBTProfileOut.setXBTRecorderSerialNumber(recorderserial);
                
            }//end if 
            if (line.hasOption("recorderyear")) {
                recorderyear = line.getOptionValue("recorderyear");
                xBTProfileOut.setXBTRecorderManufacturedYear(Integer.parseInt(recorderyear));
                
            }//end if 
            if (line.hasOption("recordermonth")) {
                recordermonth = line.getOptionValue("recordermonth");
                xBTProfileOut.setXBTRecorderManufacturedMonth(Integer.parseInt(recordermonth));
                
            }//end if 
            if (line.hasOption("recorderday")) {
                recorderday = line.getOptionValue("recorderday");
                xBTProfileOut.setXBTRecorderManufacturedDay(Integer.parseInt(recorderday));
                
            }//end if             

            if (line.hasOption("agency")) {
                agency = line.getOptionValue("agency");
                xBTProfileOut.setAgencyOwner(Integer.parseInt(agency));
                
            }//end if
            if (line.hasOption("rider")) {
                rider = line.getOptionValue("rider");
                xBTProfileOut.setRiderNames(rider);

            }//end if  
            if (line.hasOption("riderphone")) {
                riderphone = line.getOptionValue("riderphone");
                xBTProfileOut.setRiderPhones(riderphone);

            }//end if  
            if (line.hasOption("rideremail")) {
                rideremail = line.getOptionValue("rideremail");
                xBTProfileOut.setRiderEmails(rideremail);

            }//end if  
            if (line.hasOption("institution")) {
                institution = line.getOptionValue("institution");
                xBTProfileOut.setRiderInstitutions(institution);

            }//end if 
            if (line.hasOption("depth")) {
                depth = line.getOptionValue("depth");
                xBTProfileOut.setTotalWaterDepth(Integer.parseInt(depth));

            }//end if 
            if (line.hasOption("temps")) {
                stringTemps = line.getOptionValue("temps").split("@");

                double[] doubleTemps;

                if (stringTemps.length > 0 && !stringTemps[0].equals("null")) {

                    doubleTemps = new double[stringTemps.length];

                    for (int i = 0; i < stringTemps.length; i++) {
                        doubleTemps[i] = Double.parseDouble(stringTemps[i]);
                    }//end for

                }//end if
                else {
                    doubleTemps = new double[0];
                }//end else

                xBTProfileOut.setTemperaturePoints(doubleTemps);

            }//end if             
            if (line.hasOption("o")) {
                outFile = line.getOptionValue("o");
                BinEncoder encodedXBTProfile = new BinEncoder(xBTProfileOut);
                encodedXBTProfile.writeOutBinFile(outFile);
            }//end if  
            
            else {
                System.out.println(xBTProfileOut.toString());
            }//end else            

        }//end try//end try
        catch (ParseException exp) {
            // oops, something went wrong
            System.err.println("Parsing failed.  Reason: " + exp.getMessage());
        }

    }//end main

    private static void printHelp(Options options) {

        Collection list = options.getOptions();
        Iterator iterator = list.iterator();

        // while loop
        String tmp = "";
        Option otmp;
        while (iterator.hasNext()) {
            otmp = (Option) iterator.next();
            System.out.println(String.format("%-15s %s", "-" + otmp.getOpt(), otmp.getDescription()));
        }
    }//end printHelp
}//end class
