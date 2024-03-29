USE [sundae]
GO
/****** Object:  Table [dbo].[Universidad]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Universidad](
	[idUniversidad] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[calle] [varchar](50) NOT NULL,
	[nro] [int] NOT NULL,
 CONSTRAINT [PK_Universidad] PRIMARY KEY CLUSTERED 
(
	[idUniversidad] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Universidad] ON
INSERT [dbo].[Universidad] ([idUniversidad], [nombre], [calle], [nro]) VALUES (1, N'UAI', N'Av San Juan', 960)
SET IDENTITY_INSERT [dbo].[Universidad] OFF
/****** Object:  Table [dbo].[Tipo_Usuario]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_Usuario](
	[idTipoUsuario] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tipo_Usuario] PRIMARY KEY CLUSTERED 
(
	[idTipoUsuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Tipo_Usuario] ON
INSERT [dbo].[Tipo_Usuario] ([idTipoUsuario], [descripcion]) VALUES (1, N'Administrador')
INSERT [dbo].[Tipo_Usuario] ([idTipoUsuario], [descripcion]) VALUES (2, N'Estudiante')
SET IDENTITY_INSERT [dbo].[Tipo_Usuario] OFF
/****** Object:  Table [dbo].[Tipo_Examen]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_Examen](
	[idTipoExamen] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tipo_Examen] PRIMARY KEY CLUSTERED 
(
	[idTipoExamen] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Tipo_Examen] ON
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (1, N'1er Parcial')
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (2, N'2do Parcial')
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (3, N'Recuperatiorio')
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (4, N'Recup Materia')
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (5, N'Final')
INSERT [dbo].[Tipo_Examen] ([idTipoExamen], [descripcion]) VALUES (6, N'Cursando')
SET IDENTITY_INSERT [dbo].[Tipo_Examen] OFF
/****** Object:  Table [dbo].[Tipo_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_Cursada](
	[idTipoCursada] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tipo_Cursada] PRIMARY KEY CLUSTERED 
(
	[idTipoCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Tipo_Cursada] ON
INSERT [dbo].[Tipo_Cursada] ([idTipoCursada], [descripcion]) VALUES (1, N'Cuatrimestral')
INSERT [dbo].[Tipo_Cursada] ([idTipoCursada], [descripcion]) VALUES (2, N'Verano')
SET IDENTITY_INSERT [dbo].[Tipo_Cursada] OFF
/****** Object:  Table [dbo].[Dia]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Dia](
	[idDia] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Fecha_1] PRIMARY KEY CLUSTERED 
(
	[idDia] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Dia] ON
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (1, N'Lunes')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (2, N'Martes')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (3, N'Miercoles')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (4, N'Jueves')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (5, N'Viernes')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (6, N'Sabado')
INSERT [dbo].[Dia] ([idDia], [descripcion]) VALUES (7, N'Domingo')
SET IDENTITY_INSERT [dbo].[Dia] OFF
/****** Object:  Table [dbo].[Carrera]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Carrera](
	[idCarrera] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[idUniversidad] [int] NOT NULL,
	[notaMinima] [int] NOT NULL,
	[cantidadMaxFinales] [int] NOT NULL,
	[asistenciaMin] [int] NOT NULL,
	[aniosMaxFinales] [int] NOT NULL,
 CONSTRAINT [PK_Carrera] PRIMARY KEY CLUSTERED 
(
	[idCarrera] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Carrera] ON
INSERT [dbo].[Carrera] ([idCarrera], [nombre], [idUniversidad], [notaMinima], [cantidadMaxFinales], [asistenciaMin], [aniosMaxFinales]) VALUES (1, N'Ing en Sistemas', 1, 4, 5, 75, 2)
SET IDENTITY_INSERT [dbo].[Carrera] OFF
/****** Object:  Table [dbo].[Plann]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Plann](
	[idPlan] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
	[idCarrera] [int] NOT NULL,
	[anioVigencia] [int] NOT NULL,
 CONSTRAINT [PK_Plan] PRIMARY KEY CLUSTERED 
(
	[idPlan] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Plann] ON
INSERT [dbo].[Plann] ([idPlan], [nombre], [idCarrera], [anioVigencia]) VALUES (1, N'109', 1, 2009)
SET IDENTITY_INSERT [dbo].[Plann] OFF
/****** Object:  Table [dbo].[Usuario]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuario](
	[idUsuario] [int] IDENTITY(1,1) NOT NULL,
	[usuario] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[idTipoUsuario] [int] NULL,
	[idPlan] [int] NULL,
 CONSTRAINT [PK_Usuario] PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Usuario] ON
INSERT [dbo].[Usuario] ([idUsuario], [usuario], [password], [idTipoUsuario], [idPlan]) VALUES (1, N'jose', N'pepe', 2, 1)
INSERT [dbo].[Usuario] ([idUsuario], [usuario], [password], [idTipoUsuario], [idPlan]) VALUES (2, N'admin', N'admin', 1, 1)
INSERT [dbo].[Usuario] ([idUsuario], [usuario], [password], [idTipoUsuario], [idPlan]) VALUES (3, N'mario', N'mario', 2, 1)
SET IDENTITY_INSERT [dbo].[Usuario] OFF
/****** Object:  Table [dbo].[Materia]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Materia](
	[idMateria] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[idPlan] [int] NOT NULL,
	[horas] [int] NOT NULL,
 CONSTRAINT [PK_Materia] PRIMARY KEY CLUSTERED 
(
	[idMateria] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Materia] ON
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (1, N'Programacion Estructurada', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (2, N'Sistemas de Computacion 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (3, N'Laboratorio de calculo', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (4, N'Problematica del mundo actual', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (5, N'Ingles 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (6, N'Sistemas de computacion 2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (7, N'Calculo infinitesimal', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (8, N'Historia de la ciencia y de la tecnica', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (9, N'Ingles 2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (10, N'Programacion 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (11, N'Programacion Orientada a Objetos', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (12, N'Metdologias de desarrollo de sistemas 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (13, N'Calculo Infinitesimal', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (14, N'Ingles 3', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (15, N'Sistemas de representacion', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (16, N'Arquitectura de SO', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (17, N'Metodologias de desarrollo de sistemas 2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (18, N'Fisica 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (19, N'Probabilidad y estadisticas', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (20, N'Ingles 4', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (21, N'Quimica', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (22, N'LUG', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (23, N'BD', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (24, N'Tecnologias de las comunicaciones', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (25, N'Optativa', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (26, N'Trabajo de Campo', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (27, N'Fisica 2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (28, N'Teleinfo', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (29, N'Diploma', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (30, N'Analisis de procesos Administrativos', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (31, N'Discreta', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (32, N'BDA1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (33, N'BDA2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (34, N'SI', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (35, N'Org y Gest Emp', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (36, N'BD para la admin', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (37, N'LPPA', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (38, N'Adm de proy', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (39, N'Planificacion est', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (40, N'Adm Bancaria', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (41, N'Modelos', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (42, N'Electro 1', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (43, N'Sist de Hard para la adm', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (44, N'Seminario', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (45, N'Modelizacion Numerica', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (46, N'Electro 2', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (47, N'Practica Prof Sup', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (48, N'Auditoria Op', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (49, N'redes Adm', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (50, N'Teleprocesamiento avanzado', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (51, N'Seguridad Informatica', 1, 4)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan], [horas]) VALUES (52, N'Trabajo final', 1, 4)
SET IDENTITY_INSERT [dbo].[Materia] OFF
/****** Object:  Table [dbo].[Materia_Correlatividad]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Materia_Correlatividad](
	[idMateria] [int] NOT NULL,
	[idMateriaCorr] [int] NOT NULL,
 CONSTRAINT [PK_Materia_Correlatividad] PRIMARY KEY CLUSTERED 
(
	[idMateria] ASC,
	[idMateriaCorr] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (1, 10)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (2, 6)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (3, 7)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (4, 8)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (5, 9)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (6, 16)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (7, 13)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (7, 18)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (9, 14)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (10, 11)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (11, 22)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (12, 17)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (12, 23)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (13, 19)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (13, 31)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (14, 20)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (16, 24)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (17, 26)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (17, 30)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (17, 34)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (18, 27)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (18, 43)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (19, 45)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (22, 26)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (22, 37)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (23, 36)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (24, 28)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (26, 29)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (27, 42)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (28, 49)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (28, 50)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (29, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (29, 47)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (35, 39)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (37, 41)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (37, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (41, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (42, 46)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (43, 51)
INSERT [dbo].[Materia_Correlatividad] ([idMateria], [idMateriaCorr]) VALUES (44, 52)
/****** Object:  Table [dbo].[Cursada]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cursada](
	[idCursada] [int] IDENTITY(1,1) NOT NULL,
	[idMateria] [int] NOT NULL,
	[idUsuario] [int] NOT NULL,
	[fechaInicioCursada] [date] NOT NULL,
	[idTipoCursada] [int] NOT NULL,
	[fechaFinCursada] [date] NOT NULL,
 CONSTRAINT [PK_Cursada] PRIMARY KEY CLUSTERED 
(
	[idCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Cursada] ON
INSERT [dbo].[Cursada] ([idCursada], [idMateria], [idUsuario], [fechaInicioCursada], [idTipoCursada], [fechaFinCursada]) VALUES (19, 2, 1, CAST(0x5B380B00 AS Date), 1, CAST(0xB6380B00 AS Date))
INSERT [dbo].[Cursada] ([idCursada], [idMateria], [idUsuario], [fechaInicioCursada], [idTipoCursada], [fechaFinCursada]) VALUES (20, 1, 1, CAST(0x5B380B00 AS Date), 1, CAST(0xB6380B00 AS Date))
INSERT [dbo].[Cursada] ([idCursada], [idMateria], [idUsuario], [fechaInicioCursada], [idTipoCursada], [fechaFinCursada]) VALUES (21, 3, 1, CAST(0x5B380B00 AS Date), 1, CAST(0xB6380B00 AS Date))
INSERT [dbo].[Cursada] ([idCursada], [idMateria], [idUsuario], [fechaInicioCursada], [idTipoCursada], [fechaFinCursada]) VALUES (22, 4, 1, CAST(0x5B380B00 AS Date), 2, CAST(0xB6380B00 AS Date))
SET IDENTITY_INSERT [dbo].[Cursada] OFF
/****** Object:  Table [dbo].[Examen]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Examen](
	[idExamen] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [date] NOT NULL,
	[nota] [int] NULL,
	[idTipoExamen] [int] NOT NULL,
	[idCursada] [int] NOT NULL,
 CONSTRAINT [PK_Examen] PRIMARY KEY CLUSTERED 
(
	[idExamen] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Examen] ON
INSERT [dbo].[Examen] ([idExamen], [fecha], [nota], [idTipoExamen], [idCursada]) VALUES (11, CAST(0xA6380B00 AS Date), 7, 1, 19)
INSERT [dbo].[Examen] ([idExamen], [fecha], [nota], [idTipoExamen], [idCursada]) VALUES (12, CAST(0xB1380B00 AS Date), 0, 5, 21)
INSERT [dbo].[Examen] ([idExamen], [fecha], [nota], [idTipoExamen], [idCursada]) VALUES (13, CAST(0xA5380B00 AS Date), 0, 2, 19)
SET IDENTITY_INSERT [dbo].[Examen] OFF
/****** Object:  Table [dbo].[Dia_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Dia_Cursada](
	[idDiaCursada] [int] IDENTITY(1,1) NOT NULL,
	[idDia] [int] NOT NULL,
	[idCursada] [int] NOT NULL,
 CONSTRAINT [PK_Fecha] PRIMARY KEY CLUSTERED 
(
	[idDiaCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Dia_Cursada] ON
INSERT [dbo].[Dia_Cursada] ([idDiaCursada], [idDia], [idCursada]) VALUES (5, 2, 19)
INSERT [dbo].[Dia_Cursada] ([idDiaCursada], [idDia], [idCursada]) VALUES (6, 1, 20)
INSERT [dbo].[Dia_Cursada] ([idDiaCursada], [idDia], [idCursada]) VALUES (7, 3, 21)
INSERT [dbo].[Dia_Cursada] ([idDiaCursada], [idDia], [idCursada]) VALUES (8, 5, 22)
SET IDENTITY_INSERT [dbo].[Dia_Cursada] OFF
/****** Object:  Table [dbo].[Fecha_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Fecha_Cursada](
	[idFechaCursada] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [date] NOT NULL,
	[idDiaCursada] [int] NOT NULL,
	[presente] [int] NULL,
 CONSTRAINT [PK_Fecha_Cursada] PRIMARY KEY CLUSTERED 
(
	[idFechaCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Fecha_Cursada] ON
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (1, CAST(0x5C380B00 AS Date), 5, 1)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (2, CAST(0x63380B00 AS Date), 5, 1)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (3, CAST(0x6A380B00 AS Date), 5, 1)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (4, CAST(0x71380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (5, CAST(0x78380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (6, CAST(0x7F380B00 AS Date), 5, 1)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (7, CAST(0x86380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (8, CAST(0x8D380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (9, CAST(0x94380B00 AS Date), 5, 1)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (10, CAST(0x9B380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (11, CAST(0xA2380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (12, CAST(0xA9380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (13, CAST(0xB0380B00 AS Date), 5, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (14, CAST(0x5B380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (15, CAST(0x62380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (16, CAST(0x69380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (17, CAST(0x70380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (18, CAST(0x77380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (19, CAST(0x7E380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (20, CAST(0x85380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (21, CAST(0x8C380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (22, CAST(0x93380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (23, CAST(0x9A380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (24, CAST(0xA1380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (25, CAST(0xA8380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (26, CAST(0xAF380B00 AS Date), 6, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (27, CAST(0x5D380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (28, CAST(0x64380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (29, CAST(0x6B380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (30, CAST(0x72380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (31, CAST(0x79380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (32, CAST(0x80380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (33, CAST(0x87380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (34, CAST(0x8E380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (35, CAST(0x95380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (36, CAST(0x9C380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (37, CAST(0xA3380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (38, CAST(0xAA380B00 AS Date), 7, 0)
INSERT [dbo].[Fecha_Cursada] ([idFechaCursada], [fecha], [idDiaCursada], [presente]) VALUES (39, CAST(0xB1380B00 AS Date), 7, 0)
SET IDENTITY_INSERT [dbo].[Fecha_Cursada] OFF
/****** Object:  ForeignKey [FK_Carrera_Universidad]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Carrera]  WITH CHECK ADD  CONSTRAINT [FK_Carrera_Universidad] FOREIGN KEY([idCarrera])
REFERENCES [dbo].[Universidad] ([idUniversidad])
GO
ALTER TABLE [dbo].[Carrera] CHECK CONSTRAINT [FK_Carrera_Universidad]
GO
/****** Object:  ForeignKey [FK_Plan_Carrera]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Plann]  WITH CHECK ADD  CONSTRAINT [FK_Plan_Carrera] FOREIGN KEY([idCarrera])
REFERENCES [dbo].[Carrera] ([idCarrera])
GO
ALTER TABLE [dbo].[Plann] CHECK CONSTRAINT [FK_Plan_Carrera]
GO
/****** Object:  ForeignKey [FK_Usuario_Plann]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_Usuario_Plann] FOREIGN KEY([idPlan])
REFERENCES [dbo].[Plann] ([idPlan])
GO
ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_Usuario_Plann]
GO
/****** Object:  ForeignKey [FK_Usuario_Tipo_Usuario]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_Usuario_Tipo_Usuario] FOREIGN KEY([idTipoUsuario])
REFERENCES [dbo].[Tipo_Usuario] ([idTipoUsuario])
GO
ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_Usuario_Tipo_Usuario]
GO
/****** Object:  ForeignKey [FK_Materia_Plan]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Materia]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Plan] FOREIGN KEY([idPlan])
REFERENCES [dbo].[Plann] ([idPlan])
GO
ALTER TABLE [dbo].[Materia] CHECK CONSTRAINT [FK_Materia_Plan]
GO
/****** Object:  ForeignKey [FK_Materia_Correlatividad_Materia]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Materia_Correlatividad]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Correlatividad_Materia] FOREIGN KEY([idMateria])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Materia_Correlatividad] CHECK CONSTRAINT [FK_Materia_Correlatividad_Materia]
GO
/****** Object:  ForeignKey [FK_Materia_Correlatividad_Materia1]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Materia_Correlatividad]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Correlatividad_Materia1] FOREIGN KEY([idMateriaCorr])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Materia_Correlatividad] CHECK CONSTRAINT [FK_Materia_Correlatividad_Materia1]
GO
/****** Object:  ForeignKey [FK_Cursada_Materia]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Materia] FOREIGN KEY([idMateria])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Materia]
GO
/****** Object:  ForeignKey [FK_Cursada_Tipo_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Tipo_Cursada] FOREIGN KEY([idTipoCursada])
REFERENCES [dbo].[Tipo_Cursada] ([idTipoCursada])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Tipo_Cursada]
GO
/****** Object:  ForeignKey [FK_Cursada_Usuario]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Usuario] FOREIGN KEY([idUsuario])
REFERENCES [dbo].[Usuario] ([idUsuario])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Usuario]
GO
/****** Object:  ForeignKey [FK_Examen_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Examen]  WITH CHECK ADD  CONSTRAINT [FK_Examen_Cursada] FOREIGN KEY([idCursada])
REFERENCES [dbo].[Cursada] ([idCursada])
GO
ALTER TABLE [dbo].[Examen] CHECK CONSTRAINT [FK_Examen_Cursada]
GO
/****** Object:  ForeignKey [FK_Examen_Tipo_Examen]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Examen]  WITH CHECK ADD  CONSTRAINT [FK_Examen_Tipo_Examen] FOREIGN KEY([idTipoExamen])
REFERENCES [dbo].[Tipo_Examen] ([idTipoExamen])
GO
ALTER TABLE [dbo].[Examen] CHECK CONSTRAINT [FK_Examen_Tipo_Examen]
GO
/****** Object:  ForeignKey [FK_Fecha_Cursada_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Dia_Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Fecha_Cursada_Cursada] FOREIGN KEY([idCursada])
REFERENCES [dbo].[Cursada] ([idCursada])
GO
ALTER TABLE [dbo].[Dia_Cursada] CHECK CONSTRAINT [FK_Fecha_Cursada_Cursada]
GO
/****** Object:  ForeignKey [FK_Fecha_Cursada_Fecha]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Dia_Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Fecha_Cursada_Fecha] FOREIGN KEY([idDia])
REFERENCES [dbo].[Dia] ([idDia])
GO
ALTER TABLE [dbo].[Dia_Cursada] CHECK CONSTRAINT [FK_Fecha_Cursada_Fecha]
GO
/****** Object:  ForeignKey [FK_Fecha_Cursada_Dia_Cursada]    Script Date: 06/22/2014 11:55:12 ******/
ALTER TABLE [dbo].[Fecha_Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Fecha_Cursada_Dia_Cursada] FOREIGN KEY([idDiaCursada])
REFERENCES [dbo].[Dia_Cursada] ([idDiaCursada])
GO
ALTER TABLE [dbo].[Fecha_Cursada] CHECK CONSTRAINT [FK_Fecha_Cursada_Dia_Cursada]
GO
