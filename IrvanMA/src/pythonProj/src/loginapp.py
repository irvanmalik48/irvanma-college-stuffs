import getpass, os, time, obf
from os import path

class Information:
    def __init__(self, username, password):
        self.username = username
        self.password = password

    def timercount(self, number):
        while number:
            timer = '{:01d}'.format(number) 
            print(timer, end="\n") 
            time.sleep(1) 
            number -= 1
        os.system('cls||clear')

    def done(self, temporary):
        print("Done!")
        doagain = input("Do you want to continue? (y/n): ")
        if doagain == "y":
            print("Restarting...")
            f.timercount(3)
            f.mainfunction("temp")
        else:
            exit

    def check(self, searchtext):
        with open("database.db", "r", encoding='utf-8') as readobj:
            for line in readobj:
                if searchtext in line:
                    return True
        return False

    def store(self, username, password, basedata):
        if basedata == False:
            storeInfo = open("database.db", "x", encoding='utf-8')
        elif basedata == True:
            storeInfo = open("database.db", "a", encoding='utf-8')
        username = input("Please put the username: ")
        password = getpass.getpass("Please put the password: ")
        username = obf.obfuscate(username)
        password = obf.obfuscate(password)
        storeInfo.write(username + "\n" + password + "\n\n")
        storeInfo.close()
        f.done("temp")

    def forget(self, username):
       storeInfo = open("database.db", "a", encoding='utf-8')
       username = input("Please put the username: ")
       storeInfo.write(username)

    def login(self, username, password):
        storeInfo = open("database.db", "r")
        username = input("Please put the username: ")
        password = getpass.getpass("Please put the password: ")
        username = obf.obfuscate(username)
        password = obf.obfuscate(password)
        userchecker = f.check(username)
        passchecker = f.check(password)
        if userchecker == True and passchecker == True:
            print("Logged in.")
            storeInfo.close()
            f.done("temp")
        else:
            print("You have entered wrong username or password.")
            print("Please try again.\n")
            f.login("temp", "temp")

    def mainfunction(self, placeholder):
        loopfunc = False
        while loopfunc == False:
            print("PYTHON LOGIN FORM")
            check = input("Register or Login? ")
            basedata = bool(path.exists("database.db"))
            if check == "register":
                if basedata == False:
                    loopfunc = True
                    storeInfo = open("database.db", "x")
                    f.store("temp", "temp", basedata)
                elif basedata == True:
                    loopfunc = True
                    storeInfo = open("database.db", "a")
                    f.store("temp", "temp", basedata)
            elif check == "login":
                loopfunc = True
                f.login("temp", "temp")
            else:
                loopfunc = False
                print(check + " is not a valid command.")
                print("Restarting...")
                f.timercount(3)

storeInfo = "temp"
f = Information("temp", "temp")
f.mainfunction("temp")