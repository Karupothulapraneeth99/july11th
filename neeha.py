from colorama import Fore, Style, init

init(autoreset=True)

names = [("Neeha", Fore.YELLOW), ("Chanti", Fore.CYAN)]

for name, color in names:
    print(Style.BRIGHT + color + name)